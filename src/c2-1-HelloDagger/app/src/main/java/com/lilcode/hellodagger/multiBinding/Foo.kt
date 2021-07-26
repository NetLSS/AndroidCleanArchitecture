package com.lilcode.hellodagger.multiBinding

import javax.inject.Inject

class Foo {
    @Inject
    lateinit var strings: Set<String>

    fun print() {
        for (item in strings) {
            println(item)
        }
    }
}