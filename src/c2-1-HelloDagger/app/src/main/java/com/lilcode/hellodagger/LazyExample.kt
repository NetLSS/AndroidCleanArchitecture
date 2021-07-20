package com.lilcode.hellodagger

import dagger.Component
import dagger.Lazy
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class CounterModule {
    var next = 100

    @Provides
    fun provideInteger(): Int {
        println("computing...")
        return next++
    }
}

@Component(modules = [CounterModule::class])
interface CounterComponent {
    fun inject(counter: Counter)
}

class Counter {
    @Inject
    lateinit var lazy: Lazy<Int>

    fun printLazy() {
        println("printing...")
        println(lazy.get())
        println(lazy.get())
        println(lazy.get())
    }
}