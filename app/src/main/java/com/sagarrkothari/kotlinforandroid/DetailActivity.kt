package com.sagarrkothari.kotlinforandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.sagarrkothari.kotlinforandroid.models.Photo
import com.sagarrkothari.kotlinforandroid.models.PhotoList
import kotlinx.android.synthetic.main.activity_main.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val photo = intent.getSerializableExtra(PHOTO) as Photo?

        photo?.webformatURL.let {
            Glide.with(this)
                    .load(photo?.webformatURL)
                    .into(imageView)
        }

        imageView.setOnClickListener {
            finish()
        }

    }

    companion object {
        val PHOTO = "PHOTO"
    }
}
