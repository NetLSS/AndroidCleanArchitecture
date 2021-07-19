package com.lilcode.hellodagger

import dagger.Module
import dagger.Provides

@Module
class SomeModule {
    @Provides
    fun provideSomeType(): SomeType = SomeType()
}

class SomeType {}