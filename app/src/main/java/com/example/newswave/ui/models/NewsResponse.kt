package com.example.newswave.ui.models

import com.example.newswave.ui.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)