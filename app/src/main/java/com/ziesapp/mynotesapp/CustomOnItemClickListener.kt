package com.ziesapp.mynotesapp

import android.view.View

class CustomOnItemClickListener(
    private val position: Int,
    private val onItemCallBack: OnItemClickCallback
) : View.OnClickListener {
    override fun onClick(v: View) {
        onItemCallBack.onItemClicked(v, position)
    }

    interface OnItemClickCallback {
        fun onItemClicked(view: View, position: Int)
    }
}