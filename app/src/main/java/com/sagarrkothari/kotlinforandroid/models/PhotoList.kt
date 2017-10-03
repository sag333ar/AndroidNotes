package com.sagarrkothari.kotlinforandroid.models

import java.io.Serializable

/**
 * Created by sagar on 02/10/17.
 */
data class PhotoList(val totalHits: Int,
                     val total: Int,
                     val hits: List<Photo>): Serializable {

}