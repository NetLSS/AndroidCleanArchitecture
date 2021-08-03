package com.lilcode.hellodagger.androidComponentNotBoil

import dagger.Subcomponent
import dagger.android.AndroidInjector

@ActivityScope
@Subcomponent(modules = [MainActivityModule::class])
interface MainActivitySubcomponent: AndroidInjector<MainActivity> {

    @Subcomponent.Factory
    interface Factory: AndroidInjector.Factory<MainActivity>{
    }
}