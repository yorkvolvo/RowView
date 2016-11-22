package com.stay4it.rowview;

import android.graphics.Color;

import java.util.ArrayList;

/**
 * Created by lizi on 2016/11/22.
 */
public class GroupDescriptor {
    public String headerLabel;
    public boolean isHeaderHtml;
    public int headerSize;
    public int headerColor = R.color.gray;

    public String bottomLabel;
    public ArrayList<BaseRowDescriptor> descriptors;
    public int bgColor = Color.WHITE;
    public int dividerColor = R.color.general_background;


    public GroupDescriptor() {

    }

    public GroupDescriptor addDescriptor(BaseRowDescriptor descriptor) {
        if (descriptors == null) {
            descriptors = new ArrayList<>();
        }
        descriptors.add(descriptor);
        return this;
    }

    public GroupDescriptor headerLabel(String headerLabel) {
        this.headerLabel = headerLabel;
        return this;
    }

    public GroupDescriptor headerHtml(boolean isHeaderHtml) {
        this.isHeaderHtml = isHeaderHtml;
        return this;
    }

    public GroupDescriptor headerColor(int color) {
        this.headerColor = color;
        return this;
    }

    public GroupDescriptor headerSize(int size) {
        this.headerSize = size;
        return this;
    }

    public GroupDescriptor bgColor(int color) {
        this.bgColor = color;
        return this;
    }

    public GroupDescriptor bottomLabel(String bottomLabel) {
        this.bottomLabel = bottomLabel;
        return this;
    }

}
