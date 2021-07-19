package com.lilcode.hellodagger

import dagger.Component

@Component(modules = [SomeModule::class])
interface SomeComponent {
    fun getSomeType(): SomeType
}