package com.github.julesssss.moderndagger.di

import com.github.julesssss.moderndagger.AnalyticsHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * We declare our App wide dependencies in this module. All of the following dependencies will be
 * available at an app wide level.
 */
@Module
class AppModule {

    @Singleton @Provides fun providesAnalyticsHelper(): AnalyticsHelper {
        val analyticsHelper = AnalyticsHelper()
        analyticsHelper.simulatePageTracking("AppComponent")
        return analyticsHelper
    }

}