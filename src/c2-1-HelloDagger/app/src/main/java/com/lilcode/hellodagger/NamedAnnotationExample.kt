package com.lilcode.hellodagger

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named

@Component(modules = [MyModuleNamed::class])
interface MyComponentNamed {
    fun inject(myClassNamed: MyClassNamed)
}

@Module
class MyModuleNamed {
    @Provides
    @Named("hello")
    fun provideHello() = "Hello"

    @Provides
    @Named("world")
    fun provideWorld() = "World"
}

class MyClassNamed {
    @Inject
    @Named("hello")
    lateinit var strHello: String

    @Inject
    @Named("world")
    lateinit var strWorld: String
}