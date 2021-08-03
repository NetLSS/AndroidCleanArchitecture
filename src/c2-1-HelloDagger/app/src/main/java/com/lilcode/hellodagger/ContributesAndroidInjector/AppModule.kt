package com.lilcode.hellodagger.ContributesAndroidInjector

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Named
import javax.inject.Singleton

@Module
abstract class AppModule {
    companion object {
        @Named("app")
        @Provides
        @Singleton
        fun provideString() = "String from AppModule"
    }

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity

}