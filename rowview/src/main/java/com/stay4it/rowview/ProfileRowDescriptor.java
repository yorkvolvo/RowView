package com.stay4it.rowview;

/**
 * Created by lizi on 2016/11/22.
 */
public class ProfileRowDescriptor extends BaseRowDescriptor {
    public String label;
    public String detailLabel;
    public boolean hasAction;
    private String avatarUrl;


    public ProfileRowDescriptor(int rowId) {
        super(rowId);
    }

    public ProfileRowDescriptor avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public ProfileRowDescriptor label(String label) {
        this.label = label;
        return this;
    }

    public ProfileRowDescriptor detailLabel(String detailLabel) {
        this.detailLabel = detailLabel;
        return this;
    }

    public ProfileRowDescriptor hasAction(boolean hasAction) {
        this.hasAction = hasAction;
        return this;
    }

}
