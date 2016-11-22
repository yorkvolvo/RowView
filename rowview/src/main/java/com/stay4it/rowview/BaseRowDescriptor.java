package com.stay4it.rowview;

import android.view.View;

/**
 * Created by lizi on 2016/11/22.
 */
public abstract class BaseRowDescriptor {
	public int rowId = View.NO_ID;
	
	public BaseRowDescriptor(int rowId){
		this.rowId = rowId;
	}
}
