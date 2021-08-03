package com.lilcode.hellodagger.androidComponentNotBoil

import dagger.Subcomponent
import dagger.android.AndroidInjector

@FragmentScope
@Subcomponent(modules = [MainFragmentModule::class])
interface MainFragmentSubcomponent : AndroidInjector<MainFragment>{
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MainFragment>{
    }
}
