package com.android.databindingexample

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadImage")
fun ImageView.loadImage(url: String?) {
        Glide.with(context)
            .load(url)
            .into(this)
}

//bu fonksiyonun başka versiyonu
/*
@BindingAdapter("loadImage")
fun loadImage(imageView: ImageView, url: String?) {
    Glide.with(imageView.context)
        .load(url)
        .into(imageView)
}
*/
