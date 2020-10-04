package com.revolve44.newsapp1.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "article")
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val author: Any,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)