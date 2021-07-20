package com.lilcode.hellodagger

import dagger.MembersInjector
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

    @Test
    fun tet_memberInjector(){
        val myClass = MyClass()
        var str = myClass.str
        println("result = $str") // null

        val myComponent = DaggerMyComponent.create()
        val injector: MembersInjector<MyClass> = myComponent.getInjector()
        injector.injectMembers(myClass)
        str = myClass.str
        println("result = $str") // Hello World
    }

    @Test
    fun test_Injection(){
        val personComponent = DaggerPersonComponent.create()

        val personA = personComponent.getPersonA()
        println("${personA.name} : ${personA.age}") // SangSuLee : 100

        val personB = PersonB()
        DaggerPersonComponent.create().inject(personB)
        assertEquals("SangSuLee", personB.name)

        assertEquals(100, personB.age)
    }

    @Test
    fun test_lazy(){
        val componentA = DaggerCounterComponent.create()
        val counter = Counter()
        componentA.inject(counter)
        counter.printLazy()

        val componentB = DaggerCounterComponent.create()
        componentB.inject(counter)
        counter.printLazy()

        componentA.inject(counter)
        counter.printLazy()
        /*
        printing...
        computing...
        100
        100
        100
        printing...
        computing...
        100
        100
        100
        printing...
        computing...
        101
        101
        101
         */
    }


    @Test
    fun test_provider(){
        val component = DaggerCounterComponent.create()
        val counter = Counter()
        component.inject(counter)
        counter.printLazy()
        /*
        printing...
        computing...
        100
        computing...
        101
        computing...
        102
         */
    }

    @Test
    fun test_namedComponent(){
        val myClassNamed = MyClassNamed()
        val component = DaggerMyComponentNamed.create()
        component.inject(myClassNamed)
        println(myClassNamed.strHello + myClassNamed.strWorld) // HelloWorld
    }
}