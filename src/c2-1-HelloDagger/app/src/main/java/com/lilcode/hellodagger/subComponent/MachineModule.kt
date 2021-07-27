package com.lilcode.hellodagger.subComponent

import dagger.Module
import dagger.Provides

@Module
class MachineModule {
    @Provides
    fun provideCoffeeBean() = CoffeeBean()
}