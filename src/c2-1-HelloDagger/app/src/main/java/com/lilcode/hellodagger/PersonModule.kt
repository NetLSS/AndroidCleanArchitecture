package com.lilcode.hellodagger

import dagger.Module
import dagger.Provides

@Module
class PersonModule {

    @Provides
    fun provideName(): String = "SangSuLee"

    @Provides
    fun provideAge(): Int = 100
}