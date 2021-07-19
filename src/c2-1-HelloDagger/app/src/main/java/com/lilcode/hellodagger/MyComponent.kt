package com.lilcode.hellodagger

import dagger.BindsInstance
import dagger.Component
import dagger.MembersInjector

@Component(modules = [MyModule::class])
interface MyComponent {
    fun getString(): String // 프로비전 메서드, 바인드된 모듈로부터 의존성을 제공
    fun getInt(): Int
    fun getPerson(): Person

    fun inject(myClass: MyClass)
    fun getInjector():MembersInjector<MyClass>

    @Component.Builder
    interface Builder{
        fun setMyModule(myModule: MyModule): Builder
        fun build():MyComponent
    }

}

@Component(modules = [BackendModule::class, FrontendModule::class])
interface ExampleComponent{
    fun myWidget(): MyWidget

    @Component.Builder
    interface Builder {
        fun backendModule(bm: BackendModule): Builder
        fun frontendModule(fm: FrontendModule): Builder

        @BindsInstance
        fun foo(foo: Foo): Builder)
        fun build(): MyComponent
    }
}