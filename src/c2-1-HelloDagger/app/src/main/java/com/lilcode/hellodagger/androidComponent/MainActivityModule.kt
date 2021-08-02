package com.lilcode.hellodagger.androidComponent

import dagger.Module
import dagger.Provides

@Module(subcomponents = [MainFragmentComponent::class])
class MainActivityModule {
    @Provides
    @ActivityScope // 해당 스코프를 사용하여 액티비티 생명주기 동안 동일한 인스턴스 제공
    fun provideActivityName() = MainActivity::class.simpleName ?: "Failed get Activity simpleName"
}