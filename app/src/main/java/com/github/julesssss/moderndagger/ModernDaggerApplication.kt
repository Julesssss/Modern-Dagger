package com.github.julesssss.moderndagger

import com.github.julesssss.moderndagger.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

/**
 * Custom Application class. In our case only used to track the app onCreate() lifecycle event.
 */
class ModernDaggerApplication : DaggerApplication() {

    @Inject lateinit var analyticsHelper: AnalyticsHelper

    override fun onCreate() {
        super.onCreate()

        // simulate analytics tracking
        analyticsHelper.simulatePageTracking("Application-onCreate")
    }

    override fun applicationInjector(): AndroidInjector<ModernDaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

}
