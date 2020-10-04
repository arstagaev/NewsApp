package com.revolve44.newsapp1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.revolve44.newsapp1.R
import com.revolve44.newsapp1.models.Article
import kotlinx.android.synthetic.main.item_article_preview.view.*

class NewsAdapter: RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>(

){
    inner class ArticleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
  private val differentCallback = object : DiffUtil.ItemCallback<Article>(){
      override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
          return oldItem.url == newItem.url
      }

      override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
          return oldItem == newItem
      }
  }
    val differ = AsyncListDiffer(this, differentCallback) // feature

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        return ArticleViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_article_preview,
                parent,
                false
            )

        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = differ.currentList[position]
        holder.itemView.apply {
            Glide.with(this).load(article.urlToImage).into(ivArticleImage)

        }
    }


}