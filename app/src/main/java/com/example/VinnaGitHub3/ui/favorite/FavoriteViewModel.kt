package com.example.VinnaGitHub3.ui.favorite

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.VinnaGitHub3.data.Repository

class FavoriteViewModel(application: Application): AndroidViewModel(application) {

    private val repository = Repository(application)

    suspend fun getFavoriteList() = repository.getFavoriteList()
}