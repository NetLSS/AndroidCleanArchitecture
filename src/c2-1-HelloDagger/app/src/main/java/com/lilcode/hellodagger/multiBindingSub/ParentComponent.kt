package com.lilcode.hellodagger.multiBindingSub

import dagger.Component

@Component(modules = [ParentModule::class])
interface ParentComponent {
    fun strings():Set<String>
    fun childCompBuilder(): ChildComponent.Builder
}