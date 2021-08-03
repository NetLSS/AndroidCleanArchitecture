package com.lilcode.hellodagger.androidComponentNotBoil

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MainFragmentModule {
    @Named("fragment")
    @Provides
    @FragmentScope
    fun provideString() = "String from fragment"
}
