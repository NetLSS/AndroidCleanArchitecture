package com.lilcode.hellodagger.multiBindingSub

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module(subcomponents = [ChildComponent::class])
class ParentModule {
    @Provides
    @IntoSet
    fun string1() = "parent string 1"

    @Provides
    @IntoSet
    fun string2() = "parent string 2"
}