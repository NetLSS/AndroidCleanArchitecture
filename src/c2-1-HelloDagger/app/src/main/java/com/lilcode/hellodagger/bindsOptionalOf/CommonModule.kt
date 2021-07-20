package com.lilcode.hellodagger.bindsOptionalOf

import dagger.BindsOptionalOf
import dagger.Module

@Module
abstract class CommonModule {
    @BindsOptionalOf
    abstract fun bindOptionalOfString():String
}