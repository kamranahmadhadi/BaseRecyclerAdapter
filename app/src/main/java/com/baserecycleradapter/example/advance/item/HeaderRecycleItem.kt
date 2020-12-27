package com.baserecycleradapter.example.advance.item

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.base.recycleradapter.BaseRecyclerItem
import com.baserecycleradapter.example.R
import com.baserecycleradapter.example.advance.model.Header
import com.baserecycleradapter.example.advance.vh.HeaderVH

class HeaderRecycleItem(
    private val data: Header,
    override val itemLayout: Int = R.layout.simple_header
) : BaseRecyclerItem {

    override fun onBind(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is HeaderVH)
            holder.bindData(data, position)
    }

    override fun onCreateViewHolder(view: View, itemLayout: Int): HeaderVH {
        return HeaderVH(view)
    }
}