package com.base.recycleradapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BaseRecycleAdapter<ITEM : BaseRecyclerItem>(
    items: ArrayList<ITEM>?,
    private val vhFactory: BaseViewHolderFactory
) :
    RecyclerView.Adapter<RecyclerViewHolder>() {

    private val itemList: ArrayList<ITEM> = ArrayList()

    init {
        items?.let { itemList.addAll(it) }
    }

    override fun getItemViewType(position: Int): Int {
        return itemList[position].itemLayout
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            viewType, parent, false
        )
        return vhFactory.getViewHolder(viewType, view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        itemList[position].onBindItem(holder, position)
    }

    fun addFirstItem(item: ITEM) {
        itemList.add(0, item)
        notifyItemInserted(0)
    }

    fun addItem(item: ITEM) {
        itemList.add(item)
        notifyItemInserted(itemList.size - 1)
    }

    fun addItem(position: Int, item: ITEM) {
        var index = itemList.size - 1
        if (itemList.size > position)
            index = position

        itemList.add(index, item)
        notifyItemInserted(index)
    }

    fun replaceAllItem(itemList: ArrayList<ITEM>) {
        this.itemList.clear()
        this.itemList.addAll(itemList)
        notifyDataSetChanged()
    }

    fun mergeItems(itemList: ArrayList<ITEM>) {
        this.itemList.addAll(itemList)
        notifyItemRangeInserted(this.itemList.size, itemList.size)
    }

    fun removeItem(position: Int) {
        if (position > -1 && itemList.size > position) {
            this.itemList.removeAt(position)
            notifyItemRemoved(position)
        }
    }

    fun removeItem(item: ITEM) {
        removeItem(this.itemList.indexOf(item))
    }

    override fun onViewAttachedToWindow(holder: RecyclerViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.onViewAttachedToWindow()
        Log.d("KAM_REC", "Attach= ${holder.hashCode()}")
    }

    override fun onViewDetachedFromWindow(holder: RecyclerViewHolder) {
        super.onViewDetachedFromWindow(holder)
        holder.onViewDetachedFromWindow()
        Log.d("KAM_REC", "Detach= ${holder.hashCode()}, POS= ${holder.itemViewType}")
    }
}
