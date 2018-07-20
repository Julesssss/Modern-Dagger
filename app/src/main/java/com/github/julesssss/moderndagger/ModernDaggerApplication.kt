package com.github.julesssss.moderndagger

import android.app.Application

/**
 * Custom Application class. In our case only used to track the app onCreate() lifecycle event.
 */
class ModernDaggerApplication : Application() {

    private val analyticsHelper by lazy { AnalyticsHelper() }

    override fun onCreate() {
        super.onCreate()

        // simulate analytics tracking
        analyticsHelper.simulatePageTracking("Application-onCreate")
    }

}