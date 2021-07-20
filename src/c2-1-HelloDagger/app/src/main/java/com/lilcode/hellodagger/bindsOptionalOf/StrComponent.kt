package com.lilcode.hellodagger.bindsOptionalOf

import dagger.Component

@Component(modules = [CommonModule::class, HelloModule::class])
interface StrComponent {
    fun inject(foo: Foo)
}