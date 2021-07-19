package com.lilcode.hellodagger

import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    fun provideHelloWorld(): String = "Hello World"
}