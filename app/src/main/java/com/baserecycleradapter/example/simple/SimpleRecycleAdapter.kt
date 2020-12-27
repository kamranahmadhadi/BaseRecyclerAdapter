package com.baserecycleradapter.example.simple

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.baserecycleradapter.example.R
import com.baserecycleradapter.example.simple.model.HeaderDataModel
import com.baserecycleradapter.example.simple.model.ItemDataModel
import com.baserecycleradapter.example.simple.model.RecycleItem

class SimpleRecycleAdapter(val itemList: ArrayList<RecycleItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return itemList[position].layoutRes
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        if (viewType == R.layout.simple_header) {
            return HeaderViewHolder(view)
        } else if (viewType == R.layout.simple_item_data) {
            return SimpleViewHolder(view)
        }
        return DefaultView(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemData = itemList[position]
        if (holder is HeaderViewHolder) {
            if (itemData is HeaderDataModel)
                holder.setData(itemData)
        } else if (holder is SimpleViewHolder) {
            if (itemData is ItemDataModel)
                holder.setData(itemData)
        }
    }

    inner class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val headerTextView: TextView = itemView.findViewById(R.id.headerTextView)

        fun setData(header: HeaderDataModel) {
            headerTextView.text = header.title
        }
    }

    inner class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        private val button: Button = itemView.findViewById(R.id.button)

        fun setData(item: ItemDataModel) {
            titleTextView.text = item.productName
            button.text = "${item.price}"
        }
    }

    inner class DefaultView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            Log.d("KAM_LOG", "DefaultView->INIT")
        }
    }
}