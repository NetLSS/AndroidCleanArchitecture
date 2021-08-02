package com.lilcode.hellodagger.subComponentInheritance

import dagger.Component

@Component(modules = [ModuleA::class])
interface ComponentA {
    fun provideString(): String // 프로비전 메서드
}