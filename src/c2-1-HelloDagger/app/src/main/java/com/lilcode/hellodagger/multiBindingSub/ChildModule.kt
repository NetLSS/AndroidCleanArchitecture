package com.lilcode.hellodagger.multiBindingSub

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class ChildModule {
    @Provides
    @IntoSet
    fun string3() = "child string 1"

    @Provides @IntoSet
    fun string4() = "child string 2"
}