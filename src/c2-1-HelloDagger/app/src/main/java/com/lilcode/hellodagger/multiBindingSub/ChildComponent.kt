package com.lilcode.hellodagger.multiBindingSub

import dagger.Subcomponent

@Subcomponent(modules = [ChildModule::class])
interface ChildComponent {
    fun strings(): Set<String>

    @Subcomponent.Builder
    interface Builder{
        fun build():ChildComponent
    }
}