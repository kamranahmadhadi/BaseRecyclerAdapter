package com.base.recycleradapter

interface BaseRecyclerItem {
    val itemLayout: Int

    fun onBindItem(holder: RecyclerViewHolder, position: Int)
}