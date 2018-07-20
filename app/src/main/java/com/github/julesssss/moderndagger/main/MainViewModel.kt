package com.github.julesssss.moderndagger.main

import com.github.julesssss.moderndagger.AnalyticsHelper

/**
 * ViewModel which provides data and state to MainActivity. Should have no knowledge of Activity
 * behaviour or state.
 */
class MainViewModel {

    private val analyticsHelper by lazy { AnalyticsHelper() }

    /**
     * ViewModel initialisation
     */
    init {
        // simulate analytics tracking
        analyticsHelper.simulatePageTracking("ViewModel-initialisation")
    }

    /**
     * Simulates a ViewModel function.
     *
     * @return a list of integers
     */
    fun retrieveInts() = listOf(1, 2, 3, 4, 5, 6)

}