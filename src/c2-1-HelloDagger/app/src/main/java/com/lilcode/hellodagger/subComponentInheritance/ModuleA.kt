package com.lilcode.hellodagger.subComponentInheritance

import dagger.Module
import dagger.Provides

@Module
class ModuleA {
    @Provides
    fun provideString() = "String from ModuleA"
}