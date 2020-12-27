package com.baserecycleradapter.example.advance.vh

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.base.recycleradapter.BaseViewHolder
import com.baserecycleradapter.example.R
import com.bumptech.glide.Glide
import com.baserecycleradapter.example.advance.model.Fruit

class FruitVH(view: View) : BaseViewHolder<Fruit>(view) {

    private val nameTextView: TextView = view.findViewById(R.id.nameTextView)
    private val priceTextView: TextView = view.findViewById(R.id.priceTextView)
    private val fruitImageView: ImageView = view.findViewById(R.id.fruitImageView)

    override fun bindData(data: Fruit, position: Int) {
        nameTextView.text = data.name
        priceTextView.text = data.price.toString()

        Glide
            .with(fruitImageView.context)
            .load(data.imageURL)
            .placeholder(R.drawable.image_place_holder)
            .into(fruitImageView);
    }

}