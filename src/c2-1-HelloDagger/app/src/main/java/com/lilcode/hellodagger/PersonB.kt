package com.lilcode.hellodagger

import javax.inject.Inject


class PersonB {
    var name: String? = null
    @Inject set // 필드 주입

    @set:Inject // 메서드 주입 (setter)
    var age = 0
}