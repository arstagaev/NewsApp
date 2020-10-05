package com.revolve44.newsapp1.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.revolve44.newsapp1.R
import com.revolve44.newsapp1.ui.NewsActivity
import com.revolve44.newsapp1.ui.NewsViewModel

class BreakingNewsFragment : Fragment(R.layout.fragment_breaking_news){

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

    }
}