package com.lilcode.hellodagger

import dagger.Module
import dagger.Provides

@Module
class MyModule {
//    @Provides
//    fun provideHelloWorld(): String = "Hello World"

    @Provides
    fun provideName():String = "SangSuLee"

    @Provides
    fun provideInt():Int = 1234

    @Provides
    fun providePerson(name: String, age: Int): Person = Person(name, age)
}