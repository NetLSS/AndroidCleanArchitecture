package com.lilcode.hellodagger.multiBindingMap

import dagger.Component

@Component(modules = [MapModule::class])
interface MapComponent {
    fun getLongByString(): Map<String, Long>
    fun getStringByClass(): Map<Class<*>, String>
}