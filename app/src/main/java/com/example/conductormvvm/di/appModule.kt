package com.example.conductormvvm.di

import com.example.conductormvvm.ui.features.add.AddViewModel
import com.example.conductormvvm.ui.features.home.HomeViewModel
import com.example.conductormvvm.ui.features.main.MainViewModel
import com.example.conductormvvm.ui.features.news.NewsViewModel
import com.example.conductormvvm.ui.features.settings.SettingsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // activity viewmodel
    viewModel { MainViewModel() }

    // controller viewmodels
    factory { HomeViewModel() }
    factory { NewsViewModel() }
    factory { AddViewModel() }
    factory { SettingsViewModel() }
}