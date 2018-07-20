package com.github.julesssss.moderndagger.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.julesssss.moderndagger.AnalyticsHelper
import com.github.julesssss.moderndagger.R

/**
 * MainActivity is the single Activity in this project. It uses the MVVM pattern to retrieve data in
 * a single direction from the ViewModel.
 */
class MainActivity : AppCompatActivity() {

    private val viewModel by lazy { MainViewModel() }
    private val analyticsHelper by lazy { AnalyticsHelper() }

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
