package com.github.julesssss.moderndagger.di

import com.github.julesssss.moderndagger.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity
}

@Module
class MainActivityModule {
    // add MainActivity specific dependencies here
}