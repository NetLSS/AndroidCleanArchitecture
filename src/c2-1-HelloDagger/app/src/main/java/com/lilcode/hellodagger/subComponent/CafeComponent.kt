package com.lilcode.hellodagger.subComponent

import dagger.Component

@Component(modules = [CafeModule::class]) // CafeModule로부터 Machine을 제공 받음
interface CafeComponent {
    fun inject(cafe: Cafe)
}