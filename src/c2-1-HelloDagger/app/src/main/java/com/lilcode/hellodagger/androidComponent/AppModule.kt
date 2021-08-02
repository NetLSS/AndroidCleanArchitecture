package com.lilcode.hellodagger.androidComponent

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MainActivityComponent::class])
class AppModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(app: App) = app.getSharedPreferences(
        "default",
        Context.MODE_PRIVATE
    )
}