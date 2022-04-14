package com.example.VinnaGitHub3.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.VinnaGitHub3.data.Repository

class MainViewModel(application: Application): AndroidViewModel(application) {

    private val repository = Repository(application)

    fun searchUser(query: String) = repository.searchUser(query)
}