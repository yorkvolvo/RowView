package com.stay4it.rowview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by lizi on 2016/11/22.
 */
public class ToggleRowView extends BaseRowView<ToggleRowDescriptor> implements View.OnClickListener {

    private Context context;
    private TextView mWidgetRowLabel;
    private ImageView mWidgetRowIconImg;
    private ImageView mWidgetRowActionBox;

    public ToggleRowView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        initializeView();
    }

    public ToggleRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initializeView();
    }

    public ToggleRowView(Context context) {
        super(context);
        this.context = context;
        initializeView();
    }

    private void initializeView() {
        LayoutInflater.from(context).inflate(R.layout.widget_toggle_row, this);
        mWidgetRowActionBox = (ImageView) findViewById(R.id.mWidgetRowActionBox);
        mWidgetRowLabel = (TextView) findViewById(R.id.mWidgetRowLabel);
        mWidgetRowIconImg = (ImageView) findViewById(R.id.mWidgetRowIconImg);
    }

    @Override
    public void notifyDataChanged(String content) {
        mWidgetRowActionBox.setSelected(Boolean.valueOf(content));
        this.descriptor.isChecked = Boolean.valueOf(content);
    }

    @Override
    public void notifyDataChanged(ToggleRowDescriptor descriptor) {
        this.descriptor = descriptor;
        if (descriptor != null) {
            if (descriptor.iconResId > 0) {
                mWidgetRowIconImg.setBackgroundResource(descriptor.iconResId);
                mWidgetRowIconImg.setVisibility(View.VISIBLE);
            } else {
                mWidgetRowIconImg.setVisibility(View.GONE);
            }
            mWidgetRowLabel.setText(descriptor.label);
            mWidgetRowActionBox.setSelected(descriptor.isChecked);
            if (descriptor.enable) {
                mWidgetRowActionBox.setOnClickListener(this);
            } else {
                mWidgetRowActionBox.setOnClickListener(null);
            }
            mWidgetRowActionBox.setEnabled(descriptor.enable);
            setBackgroundColor(Color.WHITE);
        } else {
            setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            if (!descriptor.callback) {
                descriptor.isChecked = !descriptor.isChecked;
                mWidgetRowActionBox.setSelected(descriptor.isChecked);
            }
            listener.onRowChanged(descriptor.rowId, String.valueOf(descriptor.isChecked));
        }
    }


    @Override
    public String getContent() {
        return String.valueOf(descriptor.isChecked);
    }
}
