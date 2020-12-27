package com.baserecycleradapter.example.advance.vh

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.base.recycleradapter.BaseViewHolder
import com.baserecycleradapter.example.R
import com.bumptech.glide.Glide
import com.baserecycleradapter.example.advance.model.Animal

class AnimalVH(view: View) : BaseViewHolder<Animal>(view) {

    private val nameTextView: TextView = view.findViewById(R.id.nameTextView)
    private val typeTextView: TextView = view.findViewById(R.id.typeTextView)
    private val ageTextView: TextView = view.findViewById(R.id.ageTextView)
    private val animalImageView: ImageView = view.findViewById(R.id.animalImageView)

    override fun bindData(data: Animal, position: Int) {
        nameTextView.text = data.name
        typeTextView.text = data.type
        ageTextView.text = data.age.toString()

        Glide
            .with(animalImageView.context)
            .load("https://cdn3.nflximg.net/images/3093/2043093.jpg")
            .placeholder(R.drawable.image_place_holder)
            .into(animalImageView);
    }

}