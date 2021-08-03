package com.lilcode.hellodagger.androidComponentNotBoil

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton
/*
안드로이드 프레임워크 관련 클래스에 의존성 주입을 위임할 AndroidInjector<?> 팩토리를 멀티 바인딩으로 관리
 */
@Component(modules = [AndroidInjectionModule::class, AppModule::class])
@Singleton
interface AppComponent: AndroidInjector<App> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<App>{
        // App 인스턴스를 그래프에 바인딩 하고 Component 를 반환하는 create() 메서드가 이미 포함
    }
}