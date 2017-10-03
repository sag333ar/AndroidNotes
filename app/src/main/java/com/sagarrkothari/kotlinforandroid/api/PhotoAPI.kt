package com.sagarrkothari.kotlinforandroid.api

import com.sagarrkothari.kotlinforandroid.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by sagar on 02/10/17.
 */
interface PhotoAPI {
    @GET("?key=6604570-dc996b2daa83f596906ad736d&q=yellow+flower&image_type=photo")
    fun getPhotos(): Call<PhotoList>
}