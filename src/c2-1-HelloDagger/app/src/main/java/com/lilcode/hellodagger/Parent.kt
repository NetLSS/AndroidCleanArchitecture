package com.lilcode.hellodagger

import javax.inject.Inject

open class Parent {
    var a: A? = null
        @Inject set
}

open class Self : Parent() {
    var b: B? = null
        @Inject set
}

class Child : Self() {

    var c: C? = null
        @Inject set
}

class C