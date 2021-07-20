package com.lilcode.hellodagger.bindsOptionalOf

import dagger.Module
import dagger.Provides

@Module
class HelloModule {
    @Provides
    fun providesString() = "Hello"
}