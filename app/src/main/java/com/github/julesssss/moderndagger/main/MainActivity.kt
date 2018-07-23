package com.github.julesssss.moderndagger.main

import android.os.Bundle
import com.github.julesssss.moderndagger.AnalyticsHelper
import com.github.julesssss.moderndagger.R
import dagger.android.DaggerActivity
import javax.inject.Inject

/**
 * MainActivity is the single Activity in this project. It uses the MVVM pattern to retrieve data in
 * a single direction from the ViewModel.
 */
class MainActivity : DaggerActivity() {

    private val viewModel by lazy { MainViewModel() }
    @Inject lateinit var analyticsHelper: AnalyticsHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // simulate analytics tracking
        analyticsHelper.simulatePageTracking("MainActivity-onCreate")

        viewModel.retrieveInts().let {

            // simulate analytics tracking
            analyticsHelper.simulatePageTracking("MainActivity-observingData")
        }

    }
}
