package edu.vt.mobiledev.fancygallery

import edu.vt.mobiledev.fancygallery.api.FlickrApi
import edu.vt.mobiledev.fancygallery.api.GalleryItem
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class PhotoRepository {
    private val flickrApi: FlickrApi
    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://www.flickr.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        flickrApi = retrofit.create()
    }
    suspend fun fetchPhotos(pageSize:Int = 100): List<GalleryItem> =
        flickrApi.fetchPhotos(pageSize).photos.galleryItems
}