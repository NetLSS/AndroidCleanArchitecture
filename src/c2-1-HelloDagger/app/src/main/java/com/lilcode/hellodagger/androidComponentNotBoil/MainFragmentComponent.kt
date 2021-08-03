package com.lilcode.hellodagger.androidComponentNotBoil

import dagger.BindsInstance
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [MainFragmentModule::class])
interface MainFragmentComponent {
    fun inject(mainFragment: MainFragment)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(module: MainFragmentModule): MainFragmentComponent.Builder

        @BindsInstance
        fun setFragment(fragment: MainFragment): MainFragmentComponent.Builder
        fun build(): MainFragmentComponent
    }
}