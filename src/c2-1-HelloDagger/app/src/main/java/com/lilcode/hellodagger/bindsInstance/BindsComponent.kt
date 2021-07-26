package com.lilcode.hellodagger.bindsInstance

import dagger.BindsInstance
import dagger.Component

@Component
interface BindsComponent {
    fun inject(foo: Foo)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun setString(str: String): Builder
        fun build(): BindsComponent
    }
}
