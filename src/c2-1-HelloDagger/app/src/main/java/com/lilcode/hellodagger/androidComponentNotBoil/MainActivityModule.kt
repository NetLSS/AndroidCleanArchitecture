package com.lilcode.hellodagger.androidComponentNotBoil

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import javax.inject.Named

@Module(subcomponents = [MainFragmentSubcomponent::class]) // MainFragment 멤버 인젝션을 위해 서브 연결
abstract class MainActivityModule {
    companion object{
        @Named("activity")
        @Provides
        @ActivityScope
        fun provideString() = "String from MainActivityModule"
    }

    @Binds
    @IntoMap
    @ClassKey(MainFragment::class)
    abstract fun bindInjectorFactory(factory: MainFragmentSubcomponent.Factory): AndroidInjector.Factory<*>
    // MainFragment 를 위한 인젝터 펙토리
}