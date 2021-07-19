package com.lilcode.hellodagger

import dagger.Component

@Component(modules = [PersonModule::class])
interface PersonComponent {

    fun getPersonA():PersonA // 프로비전 매서드

    fun inject(personB: PersonB)
}