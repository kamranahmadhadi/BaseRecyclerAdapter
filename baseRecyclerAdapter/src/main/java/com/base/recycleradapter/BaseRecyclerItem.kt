package com.base.recycleradapter

import android.view.View
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

interface BaseRecyclerItem {
    val itemLayout: Int

    fun onBind(holder: RecyclerView.ViewHolder, position: Int)
    fun onCreateViewHolder(view: View, itemLayout: Int): RecyclerView.ViewHolder
}