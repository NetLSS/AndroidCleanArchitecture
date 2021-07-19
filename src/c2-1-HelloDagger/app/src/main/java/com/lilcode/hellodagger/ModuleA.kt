package com.lilcode.hellodagger

import dagger.Module
import dagger.Provides

@Module
class ModuleA {
    @Provides
    fun provideA(): A = A()
}

class A{}