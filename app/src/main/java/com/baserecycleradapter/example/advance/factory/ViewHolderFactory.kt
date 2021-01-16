package com.baserecycleradapter.example.advance.factory

import android.view.View
import com.base.recycleradapter.BaseViewHolderFactory
import com.base.recycleradapter.RecyclerViewHolder
import com.baserecycleradapter.example.R
import com.baserecycleradapter.example.advance.vh.AnimalVH
import com.baserecycleradapter.example.advance.vh.EmptyVH
import com.baserecycleradapter.example.advance.vh.FruitVH
import com.baserecycleradapter.example.advance.vh.HeaderVH

object ViewHolderFactory : BaseViewHolderFactory() {

    override fun getViewHolder(vhType: Int, view: View): RecyclerViewHolder =
        when(vhType){
            R.layout.animal_item -> AnimalVH(view)
            R.layout.fruit_item -> FruitVH(view)
            R.layout.simple_header -> HeaderVH(view)
            else -> EmptyVH(view)
        }

}