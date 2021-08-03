package com.lilcode.hellodagger.androidComponentNotBoil

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lilcode.hellodagger.R
import javax.inject.Inject

class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var activityName: String

    lateinit var component: MainActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component = (application as App).getAppComponent()
            .mainActivityComponentBuilder() // 빌더를 제공 받아
            .setModule(MainActivityModule()) // 모듈 바인딩
            .setActivity(this) // 인스턴스 바인딩
            .build()

        component.inject(this) // 의존성 주입

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment())
            .commit()
    }

    @JvmName("getComponent1")
    fun getComponent(): MainActivityComponent{
        return component
    }
}