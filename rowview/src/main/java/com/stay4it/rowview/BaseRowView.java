package com.stay4it.rowview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by lizi on 2016/11/22.
 */
public abstract class BaseRowView<T extends BaseRowDescriptor> extends LinearLayout {
    protected OnRowChangedListener listener;
    protected T descriptor;

    public BaseRowView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public BaseRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseRowView(Context context) {
        super(context);
    }

    public void setOnRowChangedListener(OnRowChangedListener listener) {
        this.listener = listener;
    }

    public abstract void notifyDataChanged(T descriptor);

    public void notifyDataChanged(String content) {

    }

    public String getContent() {
        return null;
    }

}
