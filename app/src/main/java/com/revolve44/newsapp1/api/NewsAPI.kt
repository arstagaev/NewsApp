package com.revolve44.newsapp1.api

import com.revolve44.newsapp1.models.NewsResponse
import com.revolve44.newsapp1.ui.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI{
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("coutry")
        country: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey : String = API_KEY
    ) : Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>
}