package com.revolve44.newsapp1

import com.revolve44.newsapp1.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)