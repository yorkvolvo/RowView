package com.stay4it.rowview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lizi on 2016/11/22.
 */
public class OneRowView extends BaseRowView<OneRowDescriptor> implements OnClickListener {

    private Context context;
    private ImageView mWidgetRowActionImg;
    private TextView mWidgetRowLabel;
    private ImageView mWidgetRowIconImg;
    private TextView mWidgetDetailRowLabel;
    private float density;

    public OneRowView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        initializeView();
    }

    public OneRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initializeView();
    }

    public OneRowView(Context context) {
        super(context);
        this.context = context;
        initializeView();
    }

    private void initializeView() {
        LayoutInflater.from(context).inflate(R.layout.widget_one_row, this);
        mWidgetRowActionImg = (ImageView) findViewById(R.id.mWidgetRowActionImg);
        mWidgetRowLabel = (TextView) findViewById(R.id.mWidgetRowLabel);
        mWidgetDetailRowLabel = (TextView) findViewById(R.id.mWidgetDetailRowLabel);
        mWidgetRowIconImg = (ImageView) findViewById(R.id.mWidgetRowIconImg);
        mWidgetRowActionImg.setImageResource(R.drawable.ic_row_forward);
        density = getResources().getDisplayMetrics().density;
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.onRowChanged(descriptor.rowId);
        }
    }

    @Override
    public void notifyDataChanged(String content) {
        mWidgetDetailRowLabel.setText(content);
        this.descriptor.detailLabel = content;
    }

    @Override
    public void notifyDataChanged(OneRowDescriptor descriptor) {
        this.descriptor = descriptor;
        if (descriptor != null) {
            if (descriptor.iconResId > 0) {
                mWidgetRowIconImg.setBackgroundResource(descriptor.iconResId);
                mWidgetRowIconImg.setVisibility(VISIBLE);
            } else {
                mWidgetRowIconImg.setVisibility(GONE);
            }
            mWidgetRowLabel.setText(descriptor.label);
            mWidgetRowLabel.setTextColor(getResources().getColor(descriptor.labelColor));
            if (descriptor.required) {
                mWidgetRowLabel.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_row_value_required, 0);
                mWidgetRowLabel.setCompoundDrawablePadding(5);
            }
            mWidgetDetailRowLabel.setText(descriptor.detailLabel);
            if (descriptor.detailLabelColor > 0) {
                mWidgetDetailRowLabel.setTextColor(getResources().getColor(descriptor.detailLabelColor));
            }
            if (descriptor.detailLabelHint != 0) {
                mWidgetDetailRowLabel.setHint(descriptor.detailLabelHint);
            }
            mWidgetDetailRowLabel.setGravity(descriptor.detailLabelGravity);
            if (descriptor.hasAction && descriptor.rowId > 0) {
                setOnClickListener(this);
                setBackgroundResource(R.drawable.widget_general_row_selector);
                mWidgetRowActionImg.setVisibility(VISIBLE);
            } else {
                setBackgroundColor(Color.WHITE);
                mWidgetRowActionImg.setVisibility(GONE);
            }
        } else {
            setVisibility(GONE);
        }
    }

    @Override
    public String getContent() {
        return descriptor.detailLabel;
    }
}
