package com.lilcode.hellodagger.androidComponentNotBoil

import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import javax.inject.Named
import javax.inject.Singleton

// MainActivitySubcomponent: MainActivity의 인스턴스에 멤버 인젝션을 담당
@Module(subcomponents = [MainActivitySubcomponent::class])
abstract class AppModule {

    companion object{
        @Named("app")
        @Provides
        @Singleton
        fun provideString() = "String from AppModule" // 의존성 주입하는지 확인용
    }

    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindAndroidInjectorFactory(factory: MainActivitySubcomponent.Factory): AndroidInjector.Factory<*>
    // AndroidInjectionModule 내부에 있는 Map에 AndroidInjector.Factory를 멀티 바인딩 한다
    // 서브 컴포넌트들이 편하게 멤버 인젝션을 할 수있게 인젝터 팩토리들을 멀티 바인딩으로 관리
}