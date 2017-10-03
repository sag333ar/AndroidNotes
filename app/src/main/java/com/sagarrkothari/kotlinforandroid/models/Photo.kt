package com.sagarrkothari.kotlinforandroid.models

import java.io.Serializable

/**
 * Created by sagar on 02/10/17.
 */
data class Photo(val id: String,
                 val likes: Int,
                 val previewURL: String,
                 val webformatURL: String,
                 val favorites: Int,
                 val tags: String): Serializable {
}