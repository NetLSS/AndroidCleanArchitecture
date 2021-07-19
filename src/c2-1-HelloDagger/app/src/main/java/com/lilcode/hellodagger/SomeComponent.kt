package com.lilcode.hellodagger

import dagger.Component

@Component(modules = [SomeModule::class])
interface SomeComponent {
    fun getSomeType(): SomeType
    fun injectSomeType(someType: SomeType)
    fun injectAndReturnSomeType(someType: SomeType): SomeType
}