package com.example.VinnaGitHub3.util

import androidx.annotation.StringRes
import com.example.VinnaGitHub3.BuildConfig
import com.example.VinnaGitHub3.R

object Constanta {
    const val TIME_SPLASH = 2000L

    const val EXTRA_USER = "EXTRA_USER"

    @StringRes
    val TAB_TITLES = intArrayOf(
        R.string.followers,
        R.string.following
    )
    const val GITHUB_TOKEN = "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"

    const val BASE_URL = "https://api.github.com"
}