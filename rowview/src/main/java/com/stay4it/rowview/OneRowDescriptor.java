package com.stay4it.rowview;

import android.view.Gravity;


/**
 * Created by lizi on 2016/11/22.
 */
public class OneRowDescriptor extends BaseRowDescriptor {
    public int detailLabelGravity = Gravity.LEFT;
    public int iconResId;
    public String label;
    public String detailLabel;
    public boolean hasAction;
    public int detailLabelHint;
    public boolean required;
    public int labelColor = R.color.black;
    public int detailLabelColor = R.color.black;

    public OneRowDescriptor(int rowId) {
        super(rowId);
    }

    public OneRowDescriptor iconResId(int iconResId) {
        this.iconResId = iconResId;
        return this;
    }

    public OneRowDescriptor label(String label) {
        this.label = label;
        return this;
    }

    public OneRowDescriptor detailLabel(String detailLabel) {
        this.detailLabel = detailLabel;
        return this;
    }

    public OneRowDescriptor detailLabelColor(int detailLabelColor) {
        this.detailLabelColor = detailLabelColor;
        return this;
    }

    public OneRowDescriptor labelColor(int labelColor) {
        this.labelColor = labelColor;
        return this;
    }

    public OneRowDescriptor detailLabelHint(int detailLabelHint) {
        this.detailLabelHint = detailLabelHint;
        return this;
    }

    public OneRowDescriptor hasAction(boolean hasAction) {
        this.hasAction = hasAction;
        return this;
    }

    public OneRowDescriptor detailLabelGravity(int gravity) {
        this.detailLabelGravity = gravity;
        return this;
    }

    public OneRowDescriptor required(boolean required) {
        this.required = required;
        return this;
    }
}
