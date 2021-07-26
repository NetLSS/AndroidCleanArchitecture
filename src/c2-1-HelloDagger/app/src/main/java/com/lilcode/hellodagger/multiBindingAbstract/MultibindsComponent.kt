package com.lilcode.hellodagger.multiBindingAbstract

import dagger.Component

@Component(modules = [MultibindsModules::class])
interface MultibindsComponent {
    fun getStrings(): Set<String>
}