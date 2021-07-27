package com.lilcode.hellodagger.subComponent

import dagger.Module
import dagger.Provides

@Module(subcomponents = [MachineComponent::class])
class CafeModule {
    @Provides
    fun provideWater() = Water()

    @Provides
    fun provideMachine(builder: MachineComponent.Builder) = Machine(builder)
}