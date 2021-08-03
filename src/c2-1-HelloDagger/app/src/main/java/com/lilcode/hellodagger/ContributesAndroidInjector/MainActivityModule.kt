package com.lilcode.hellodagger.ContributesAndroidInjector

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Named

@Module
abstract class MainActivityModule {

    companion object {
        @Named("activity")
        @Provides
        @ActivityScope
        fun provideString() = "String from MainActivityModule"
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun mainFragment(): MainFragment
}