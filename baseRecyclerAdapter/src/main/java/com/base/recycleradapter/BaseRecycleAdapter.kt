package com.base.recycleradapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BaseRecycleAdapter<ITEM : BaseRecyclerItem>(items: ArrayList<ITEM>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val itemList: ArrayList<ITEM> = ArrayList()

    init {
        itemList.addAll(items)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewTypeAsPosition: Int
    ): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            itemList[viewTypeAsPosition].itemLayout, parent, false)

        return itemList[viewTypeAsPosition].onCreateViewHolder(view, viewTypeAsPosition)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        itemList[position].onBind(holder, position)
    }
}
