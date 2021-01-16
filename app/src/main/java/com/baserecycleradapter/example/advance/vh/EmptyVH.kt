package com.baserecycleradapter.example.advance.vh

import android.view.View
import com.base.recycleradapter.BaseViewHolder

class EmptyVH(view: View) : BaseViewHolder<Any>(view) {

    override fun bindData(data: Any, position: Int) {
    }
}