package com.lilcode.hellodagger

import com.lilcode.hellodagger.bindsInstance.DaggerBindsComponent
import com.lilcode.hellodagger.bindsOptionalOf.DaggerNoStrComponent
import com.lilcode.hellodagger.bindsOptionalOf.DaggerStrComponent
import com.lilcode.hellodagger.bindsOptionalOf.Foo
import com.lilcode.hellodagger.multiBindingMap.DaggerMapComponent
import com.lilcode.hellodagger.multiBindingSet.DaggerSetComponent
import com.lilcode.hellodagger.multiBindingUserKey.Animal
import com.lilcode.hellodagger.multiBindingUserKey.DaggerMapKeyComponent
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
    fun test_helloWorld() {
        val myComponent = DaggerMyComponent.create()
        println("result = ${myComponent.getString()}")
    }

    @Test
    fun test_memberInjection() {
        val myClass = MyClass()
        var str = myClass.str
        assertNull("조회 결과 null", str)

        val myComponent = DaggerMyComponent.create()
        myComponent.inject(myClass)
        str = myClass.str
        assertEquals("Hello World", str)
    }

    @Test
    fun tet_memberInjector() {
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
    fun test_Injection() {
        val personComponent = DaggerPersonComponent.create()

        val personA = personComponent.getPersonA()
        println("${personA.name} : ${personA.age}") // SangSuLee : 100

        val personB = PersonB()
        DaggerPersonComponent.create().inject(personB)
        assertEquals("SangSuLee", personB.name)

        assertEquals(100, personB.age)
    }

    @Test
    fun test_lazy() {
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
    fun test_provider() {
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
    fun test_namedComponent() {
        val myClassNamed = MyClassNamed()
        val component = DaggerMyComponentNamed.create()
        component.inject(myClassNamed)
        println(myClassNamed.strHello + myClassNamed.strWorld) // HelloWorld
    }

    @Test
    fun test_anyIdentity() {
        val myComponent = DaggerMyComponent2.create()
        val temp1 = myComponent.getAny()
        val temp2 = myComponent.getAny()
        assertNotNull(temp1)
        assertNotNull(temp2)
        assertSame(temp1, temp2)
    }

    @Test
    fun test_Foo() {
        val foo = Foo()

        DaggerStrComponent.create().inject(foo)
        println(foo.str.isPresent) // true
        println(foo.str.get()) // Hello

        DaggerNoStrComponent.create().inject(foo)
        println(foo.str.isPresent) // false
        println(foo.str.get()) // java.util.NoSuchElementException: No value present
    }

    @Test
    fun test_bindsInstance() {
        val hello = "Hello World"
        val foo = com.lilcode.hellodagger.bindsInstance.Foo()
        val component = DaggerBindsComponent.builder()
            .setString(hello)
            .build()
        component.inject(foo)
        assertEquals("Hello World", foo.str)
    }

    @Test
    fun test_multiBinding(){
        val foo = com.lilcode.hellodagger.multiBindingSet.Foo()
        DaggerSetComponent.create().inject(foo)
        foo.print()
        /*
        Hello
        World
        Lee
        Kim
         */
    }

    @Test
    fun test_multiBindingMap(){
        val component = DaggerMapComponent.create()
        val value = component.getLongByString()["foo"]
        val str = component.getStringByClass()[com.lilcode.hellodagger.multiBindingMap.Foo::class.java]

        println(value)
        println(str)
    }
    /*
    100
    Foo String
     */

    @Test
    fun test_customMapKey(){
        val component = DaggerMapKeyComponent.create()
        val cat = component.getStringsByAnimal()[Animal.CAT]
        val dog = component.getStringsByAnimal()[Animal.DOG]
        val number = component.getStringsByNumber()[Float::class.java]

        println(cat)
        println(dog)
        println(number)
    }
    /*
    Meow
    Bow-wow
    100f
     */
}