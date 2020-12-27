package com.base.recycleradapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<TYPE>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bindData(data: TYPE, position:Int)
}