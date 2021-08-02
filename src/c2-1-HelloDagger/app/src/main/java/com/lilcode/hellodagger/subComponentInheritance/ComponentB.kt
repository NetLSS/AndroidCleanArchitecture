package com.lilcode.hellodagger.subComponentInheritance

import dagger.Component

@Component(
    modules = [ModuleB::class],
    dependencies = [ComponentA::class]
)
interface ComponentB {
    fun inject(foo: Foo)
}