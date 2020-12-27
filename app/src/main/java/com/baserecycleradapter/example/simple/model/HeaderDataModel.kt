package com.baserecycleradapter.example.simple.model

import androidx.annotation.LayoutRes

data class HeaderDataModel(
    @LayoutRes
    override val layoutRes: Int,
    val title:String
): RecycleItem