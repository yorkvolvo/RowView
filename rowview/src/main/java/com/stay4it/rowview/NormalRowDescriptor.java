package com.stay4it.rowview;

/**
 * Created by lizi on 2016/11/22.
 */
public class NormalRowDescriptor extends BaseRowDescriptor {
    public int iconResId;
    public String label;
    public boolean hasAction;


    public NormalRowDescriptor(int rowId) {
        super(rowId);
    }

    public NormalRowDescriptor iconResId(int iconResId) {
        this.iconResId = iconResId;
        return this;
    }

    public NormalRowDescriptor label(String label) {
        this.label = label;
        return this;
    }

    public NormalRowDescriptor hasAction(boolean hasAction) {
        this.hasAction = hasAction;
        return this;
    }

}
