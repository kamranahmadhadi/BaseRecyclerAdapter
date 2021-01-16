package com.baserecycleradapter.example.advance.item

import com.base.recycleradapter.BaseRecyclerItem
import com.base.recycleradapter.RecyclerViewHolder
import com.baserecycleradapter.example.R
import com.baserecycleradapter.example.advance.model.Fruit
import com.baserecycleradapter.example.advance.vh.FruitVH

class FruitRecycleItem(
    val data: Fruit,
    override val itemLayout: Int = R.layout.fruit_item
) : BaseRecyclerItem {

    override fun onBindItem(holder: RecyclerViewHolder, position: Int) {
        if (holder is FruitVH)
            holder.bindData(data, position)
    }

}