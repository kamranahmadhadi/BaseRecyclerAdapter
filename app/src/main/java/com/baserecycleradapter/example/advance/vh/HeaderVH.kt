package com.baserecycleradapter.example.advance.vh

import android.view.View
import android.widget.TextView
import com.base.recycleradapter.BaseViewHolder
import com.baserecycleradapter.example.R
import com.baserecycleradapter.example.advance.model.Header

class HeaderVH(view: View) : BaseViewHolder<Header>(view) {
    private val headerTextView: TextView = view.findViewById(R.id.headerTextView)

    override fun bindData(data: Header, position: Int) {
        headerTextView.text = data.title
    }
}