package com.lilcode.hellodagger.multiBindingAbstract

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.Multibinds
import java.util.*

@Module
abstract class MultibindsModules {
//    @Multibinds
//    abstract fun strings(): Set<String>

    companion object{
        @Provides
        @ElementsIntoSet
        fun emptyStrings() = Collections.emptySet<String>()
    }
}