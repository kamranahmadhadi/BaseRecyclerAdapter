package com.baserecycleradapter.example.advance.item

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.base.recycleradapter.BaseRecyclerItem
import com.baserecycleradapter.example.R
import com.baserecycleradapter.example.advance.model.Animal
import com.baserecycleradapter.example.advance.vh.AnimalVH

class AnimalRecycleItem(
    private val data: Animal,
    override val itemLayout: Int = R.layout.animal_item
) :
    BaseRecyclerItem {

    override fun onBind(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is AnimalVH)
            holder.bindData(data, position)
    }

    override fun onCreateViewHolder(view: View, itemLayout: Int): AnimalVH {
        return AnimalVH(view)
    }


}