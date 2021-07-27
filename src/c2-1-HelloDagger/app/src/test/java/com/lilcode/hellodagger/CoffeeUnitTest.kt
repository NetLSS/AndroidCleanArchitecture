package com.lilcode.hellodagger

import com.lilcode.hellodagger.subComponent.Cafe
import org.junit.Test

class CoffeeUnitTest {
    @Test
    fun test_cafe(){
        val cafe = Cafe()
        println(cafe.orderCoffee())
        println(cafe.orderCoffee())
        println(cafe.orderCoffee())
    }
}
/*
com.lilcode.hellodagger.subComponent.Coffee@72a9989
com.lilcode.hellodagger.subComponent.Coffee@4a0fd396
com.lilcode.hellodagger.subComponent.Coffee@32cd3972
 */