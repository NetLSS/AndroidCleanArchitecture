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

    @Test
    fun test_memberInjection(){
        val myClass = MyClass()
        var str = myClass.str
        assertNull("조회 결과 null", str)

        val myComponent = DaggerMyComponent.create()
        myComponent.inject(myClass)
        str = myClass.str
        assertEquals("Hello World", str)
    }
}