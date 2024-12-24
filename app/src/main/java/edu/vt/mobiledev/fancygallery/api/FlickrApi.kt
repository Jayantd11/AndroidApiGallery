package edu.vt.mobiledev.fancygallery.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "a754421d97b7b60b584395c6a1e9b8db"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s,geo"
    )
    suspend fun fetchPhotos(@Query("per_page") pageSize:Int): FlickrResponse
}
