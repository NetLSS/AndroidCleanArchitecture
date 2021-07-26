package com.lilcode.hellodagger.multiBindingSet

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet

@Module
class SetModule {
    @Provides
    @IntoSet
    fun provideHello() = "Hello"

    @Provides
    @IntoSet
    fun provideWorld() = "World"

    @Provides
    @ElementsIntoSet
    fun provideSet() = setOf<String>("Lee", "Kim")// set 일부를 한번에 추가
}
