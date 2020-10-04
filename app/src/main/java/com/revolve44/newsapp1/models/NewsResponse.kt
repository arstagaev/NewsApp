package com.revolve44.newsapp1.models

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)