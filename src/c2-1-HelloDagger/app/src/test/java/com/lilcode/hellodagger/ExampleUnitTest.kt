package com.lilcode.hellodagger

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test_helloWorld(){
       val myComponent = DaggerMyComponent.create()
        println("result = ${myComponent.getString()}")
    }
}