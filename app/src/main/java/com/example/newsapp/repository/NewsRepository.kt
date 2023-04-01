package com.example.newsapp.repository

import com.example.newsapp.api.RetrofitInstance
import com.example.newsapp.db.ArticleDatabase
import com.example.newsapp.model.Article

class NewsRepository(
    private val database: ArticleDatabase
) {

    suspend fun getAllBreakingNews(countryCode: String, pageNumber: Int) = RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(query: String, pageNumber: Int) = RetrofitInstance.api.searchNews(query, pageNumber)

    suspend fun upsert(article: Article) = database.getArticleDao().upsert(article)

    suspend fun delete(article: Article) = database.getArticleDao().delete(article)

    fun getAllSavedNews() = database.getArticleDao().getAllArticles()

}