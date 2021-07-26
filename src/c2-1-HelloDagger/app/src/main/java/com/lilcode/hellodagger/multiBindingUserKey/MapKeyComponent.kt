package com.lilcode.hellodagger.multiBindingUserKey

import dagger.Component

@Component(modules = [MapModule::class])
interface MapKeyComponent {
    fun getStringsByAnimal(): Map<Animal, String>
    fun getStringsByNumber(): Map<Class<out Number>, String>
}