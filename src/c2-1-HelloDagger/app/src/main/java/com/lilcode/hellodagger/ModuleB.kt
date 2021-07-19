package com.lilcode.hellodagger

import dagger.Module
import dagger.Provides

@Module(includes = [ModuleA::class])
class ModuleB {
    @Provides
    fun provideB() = B()
}

class B{}