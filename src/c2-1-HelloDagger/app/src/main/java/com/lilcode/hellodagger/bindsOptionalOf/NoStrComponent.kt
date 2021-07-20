package com.lilcode.hellodagger.bindsOptionalOf

import dagger.Component

@Component(modules = [CommonModule::class])
interface NoStrComponent {
    fun inject(foo: Foo)
}