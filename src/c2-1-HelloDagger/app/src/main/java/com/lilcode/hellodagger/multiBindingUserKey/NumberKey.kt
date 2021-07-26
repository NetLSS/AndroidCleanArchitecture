package com.lilcode.hellodagger.multiBindingUserKey

import dagger.MapKey
import kotlin.reflect.KClass


@MapKey
annotation class NumberKey(val value: KClass<out Number>) // Number 클래스의 서브 클래스 타입을 속성으로.