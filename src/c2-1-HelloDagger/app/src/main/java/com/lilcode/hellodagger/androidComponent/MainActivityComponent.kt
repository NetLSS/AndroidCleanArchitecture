package com.lilcode.hellodagger.androidComponent

import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [MainActivityModule::class])
@ActivityScope
interface MainActivityComponent {
    fun mainFragmentComponentBuilder(): MainFragmentComponent.Builder

    fun inject(activity: MainActivity)

    @Subcomponent.Builder
    interface Builder{
        fun setModule(module: MainActivityModule): Builder

        /*
         엑티비티 인스턴스도 시스템에 의해 생성되므로
         액티비티 생명주기 콜백 내에서 서브 컴포넌트 빌드 시 바인딩할 수 있도록 @BindsInstance 사용
         setter 메서드로 액티비티 인스턴스를 바인딩
         */
        @BindsInstance
        fun setActivity(activity: MainActivity): Builder
        fun build():MainActivityComponent
    }
}