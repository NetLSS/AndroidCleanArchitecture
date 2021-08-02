package com.lilcode.hellodagger.subComponentInheritance

import javax.inject.Inject
import javax.inject.Named

class Foo {
    @Inject
    lateinit var str: String

    @set: [Inject Named("int")]
    var int: Int? = null
}