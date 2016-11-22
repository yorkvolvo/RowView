package com.stay4it.rowview;

/**
 * Created by lizi on 2016/11/22.
 */
public interface OnRowChangedListener {
	void onRowChanged(int rowId);

	void onRowChanged(int rowId, String content);
}
