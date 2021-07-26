package com.lilcode.hellodagger.multiBinding

import dagger.Component

@Component(modules = [SetModule::class])
interface SetComponent {
    fun inject(foo: Foo)
}