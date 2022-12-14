package se.linerotech.myapplication

import retrofit2.http.GET
import se.linerotech.myapplication.api.NewsJSON

interface APIRequest {

    @GET("/v1/latest-news?language=sv&apiKey=7goxs3CKQUAJRGhquf6BovIkIToi_vj5Uii2lTrQCVE9EtY2")
    suspend fun getNews() : NewsJSON

}