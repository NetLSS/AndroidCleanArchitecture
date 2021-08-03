package com.lilcode.hellodagger.androidComponentNotBoil

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    /**
     * 서브 컴포넌트(MainActivityComponent)에 빌더가 정의 되어 있으면,
     * 컴포넌트에서 서브 컴포넌트의 빌더를 반환하는 프로비전 메서드를 가질 수 있음
     */
    fun mainActivityComponentBuilder(): MainActivityComponent.Builder

    fun inject(app: App)

    /*
    팩토리를 통해 생성
    create() 매개 변수로 애플리케이션 컴포넌트의 모듈로 AppModul,
    애플리케이션 클래스인 App을 받음
     */
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: App, appModule: AppModule): AppComponent
    }
}