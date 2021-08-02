package com.lilcode.hellodagger.androidComponent

import dagger.Module
import dagger.Provides
import kotlin.random.Random

@Module
class MainFragmentModule {
    @Provides
    @FragmentScope
    fun provideInt() = Random.nextInt()
}
