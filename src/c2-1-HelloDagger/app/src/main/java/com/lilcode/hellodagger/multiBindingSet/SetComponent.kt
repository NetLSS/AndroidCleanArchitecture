package com.lilcode.hellodagger.multiBindingSet

import dagger.Component

@Component(modules = [SetModule::class])
interface SetComponent {
    fun inject(foo: Foo)
}