package com.lilcode.hellodagger.androidComponent

import android.app.Application

class App : Application() {

    private lateinit var appComponent: AppComponent

    @Override
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory()
            .create(this, AppModule())
    }

    fun getAppComponent() = appComponent
}