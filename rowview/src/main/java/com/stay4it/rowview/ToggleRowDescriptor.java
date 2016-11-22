package com.stay4it.rowview;

/**
 * Created by lizi on 2016/11/22.
 */
public class ToggleRowDescriptor extends BaseRowDescriptor {
    public int iconResId;
    public String label;
    public boolean isChecked;
    public boolean enable = true;
    public boolean callback;

    public ToggleRowDescriptor(int rowId) {
        super(rowId);
    }

    public ToggleRowDescriptor iconResId(int iconResId) {
        this.iconResId = iconResId;
        return this;
    }

    public ToggleRowDescriptor label(String label) {
        this.label = label;
        return this;
    }

    public ToggleRowDescriptor isChecked(boolean isChecked){
        this.isChecked = isChecked;
        return this;
    }

    public ToggleRowDescriptor enable(boolean enable) {
        this.enable = enable;
        return this;
    }

    public ToggleRowDescriptor callback(boolean callback) {
        this.callback = callback;
        return this;
    }
}
