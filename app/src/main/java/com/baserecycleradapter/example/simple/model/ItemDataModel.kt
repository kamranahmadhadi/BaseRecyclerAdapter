package com.baserecycleradapter.example.simple.model

import androidx.annotation.LayoutRes

data class ItemDataModel(
    @LayoutRes
    override val layoutRes:Int,
    val productName:String,
    val price:Long
): RecycleItem