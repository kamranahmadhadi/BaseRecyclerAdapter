package com.baserecycleradapter.example.advance.item

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.base.recycleradapter.BaseRecyclerItem
import com.baserecycleradapter.example.R
import com.baserecycleradapter.example.advance.model.Fruit
import com.baserecycleradapter.example.advance.vh.FruitVH

class FruitRecycleItem(
    val data: Fruit,
    override val itemLayout: Int = R.layout.fruit_item
) : BaseRecyclerItem {

    override fun onBind(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is FruitVH)
            holder.bindData(data, position)
    }

    override fun onCreateViewHolder(view: View, itemLayout: Int): FruitVH {
        return FruitVH(view)
    }

}