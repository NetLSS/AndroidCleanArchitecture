package com.lilcode.hellodagger.subComponent

class Machine {
    private lateinit var component: MachineComponent
    constructor(builder: MachineComponent.Builder){
        component = builder.setMachineModule(MachineModule())
            .build()
        component.inject(this)
    }

    fun extract() = component.getCoffee()
}