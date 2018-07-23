package com.github.julesssss.moderndagger.di

import com.github.julesssss.moderndagger.ModernDaggerApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton @Component(modules = [(AndroidInjectionModule::class), (ActivityBuilder::class), (AppModule::class)])
interface AppComponent : AndroidInjector<ModernDaggerApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<ModernDaggerApplication>()
}