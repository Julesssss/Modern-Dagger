package com.github.julesssss.moderndagger

import android.app.Application

class ModernDaggerApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        log("Application - onCreate")
    }

}