package com.lilcode.hellodagger.subComponent

import javax.inject.Inject

class Cafe {
    @Inject
    lateinit var coffeeMachine: Machine

    init{
        DaggerCafeComponent.create().inject(this)
    }

    fun orderCoffee() = coffeeMachine.extract()
}