package com.lilcode.hellodagger.ContributesAndroidInjector

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