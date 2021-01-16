package com.base.recycleradapter

import android.view.View

abstract class BaseViewHolderFactory {

    abstract fun getViewHolder(vhType: Int, view: View): RecyclerViewHolder
}