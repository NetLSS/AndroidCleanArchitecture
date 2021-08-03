package com.lilcode.hellodagger.daggerBaseClass

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {

    // 애플리케이션 컴포넌트를 반환. 이로써 기존 코드 대체 가능
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}