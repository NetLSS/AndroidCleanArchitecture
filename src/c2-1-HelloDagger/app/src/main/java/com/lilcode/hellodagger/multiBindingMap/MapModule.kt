package com.lilcode.hellodagger.multiBindingMap

import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
class MapModule {
    companion object {
        @Provides
        @IntoMap
        @StringKey("foo")
        fun provideFooValue() = 100L

        @Provides
        @IntoMap
        @ClassKey(Foo::class)
        fun provideFooStr() = "Foo String"
    }
}