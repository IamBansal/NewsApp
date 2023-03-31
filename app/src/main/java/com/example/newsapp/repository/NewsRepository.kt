package com.example.newsapp.repository

import com.example.newsapp.api.RetrofitInstance
import com.example.newsapp.db.ArticleDatabase

class NewsRepository(
    val database: ArticleDatabase
) {

    suspend fun getAllBreakingNews(countryCode: String, pageNumber: Int) = RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

}