package com.example.conductormvvm.ui.features.settings

import com.example.conductormvvm.R
import com.example.conductormvvm.ui.base.BaseController
import org.koin.core.component.inject

class SettingsController : BaseController(R.layout.controller_settings) {

    private val viewModel: SettingsViewModel by inject()

    override fun onViewCreated() {
        viewModel.toString()
        // todo subscribe to stateflow + sharedflow
    }
}