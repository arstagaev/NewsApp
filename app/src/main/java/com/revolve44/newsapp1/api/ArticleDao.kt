package com.revolve44.newsapp1.api

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.revolve44.newsapp1.models.Article


@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article)
}