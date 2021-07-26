package com.lilcode.hellodagger.multiBindingUserKey

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class MapModule {
    @IntoMap
    @AnimalKey(Animal.CAT)
    @Provides
    fun provideCat() = "Meow"

    @IntoMap
    @AnimalKey(Animal.DOG)
    @Provides
    fun provideDog() = "Bow-wow"

    @IntoMap
    @NumberKey(Float::class)
    @Provides
    fun provideFloatValue() = "100f"

    @IntoMap
    @NumberKey(Int::class)
    @Provides
    fun provideIntValue() = "1"
}