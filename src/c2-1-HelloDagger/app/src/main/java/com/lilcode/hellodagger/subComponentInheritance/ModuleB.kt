package com.lilcode.hellodagger.subComponentInheritance

import dagger.Module
import dagger.Provides

@Module
class ModuleB {
    @Provides
    fun provideInteger() = 100
}
