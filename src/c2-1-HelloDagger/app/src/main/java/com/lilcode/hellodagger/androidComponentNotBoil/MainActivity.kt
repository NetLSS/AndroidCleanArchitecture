package com.lilcode.hellodagger.androidComponentNotBoil

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.lilcode.hellodagger.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject
import javax.inject.Named

class MainActivity: AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    @Named("app")
    lateinit var appString: String

    @Inject
    @Named("activity")
    lateinit var activityString: String

    override fun onCreate(savedInstanceState: Bundle?) {

        AndroidInjection.inject(this) // 호출 시 App 으로 부터 DispatchingAndroidInjector<Any> 를 얻고
        // 이를 통해 MainActivity에 맞는 AndroidInjector.Factory 클래스 이름을 통해 찾는다
        // 팩토리를 통해서 생성된 MainActivitySubComponent는 액티비티에서 호출한 inject()를 통해 의존성 주입 완료

        Log.e("MainActivity", appString)
        Log.e("MainActivity", activityString)

        /*
        2021-08-03 11:46:35.979 28214-28214/com.lilcode.hellodagger E/MainActivity: String from AppModule
        2021-08-03 11:46:35.979 28214-28214/com.lilcode.hellodagger E/MainActivity: String from MainActivityModule
         */

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment())
            .commit()
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }
}