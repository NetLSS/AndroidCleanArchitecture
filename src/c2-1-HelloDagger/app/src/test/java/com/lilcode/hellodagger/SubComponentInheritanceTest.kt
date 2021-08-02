package com.lilcode.hellodagger

import com.lilcode.hellodagger.subComponentInheritance.DaggerComponentA
import com.lilcode.hellodagger.subComponentInheritance.DaggerComponentB
import com.lilcode.hellodagger.subComponentInheritance.Foo
import org.junit.Test

class SubComponentInheritanceTest {
    @Test
    fun test_subComponentInheritance(){
        val foo = Foo()

        val componentA = DaggerComponentA.create()
        val componentB = DaggerComponentB.builder()
            .componentA(componentA)
            .build()
        componentB.inject(foo)

        println(foo.str) // String from ModuleA
        println(foo.int) // 100
    }
}