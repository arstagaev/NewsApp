package com.revolve44.newsapp1.ui

import androidx.lifecycle.ViewModel
import com.revolve44.newsapp1.repository.NewsRepository

class NewsViewModel (
    val newsRepository: NewsRepository
) : ViewModel() {


}
