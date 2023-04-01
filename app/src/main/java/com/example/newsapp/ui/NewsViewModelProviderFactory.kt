package com.example.newsapp.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsapp.repository.NewsRepository
import com.example.newsapp.viewmodel.NewsViewModel

@Suppress("UNCHECKED_CAST")
class NewsViewModelProviderFactory(
    val app:Application,
    private val repository: NewsRepository
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(app, repository) as T
    }

}