package com.lilcode.hellodagger

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Hello {
}

@Component(modules = [MyModuleNamed::class])
interface MyComponentNamed {
    fun inject(myClassNamed: MyClassNamed)
}

@Module
class MyModuleNamed {
    @Provides
    @Hello
    fun provideHello() = "Hello"

    @Provides
    fun provideWorld() = "World"
}

class MyClassNamed {
    @Inject
    @Hello
    lateinit var strHello: String

    @Inject
    lateinit var strWorld: String
}