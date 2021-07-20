package com.lilcode.hellodagger

import dagger.Component
import dagger.Module
import dagger.Provides
import java.util.*
import javax.inject.Singleton

@Module
class MyModule {
    @Provides
    fun provideHelloWorld(): String = "Hello World"

//    @Provides
//    fun provideName():String = "SangSuLee"

    @Provides
    fun provideInt(): Int = 1234

    @Provides
    fun providePerson(name: String, age: Int): Person = Person(name, age)
}


// @Singleton 사용하기
@Module
class MyModule2{
    @Provides
    @Singleton
    fun provideAny() = Any()
}