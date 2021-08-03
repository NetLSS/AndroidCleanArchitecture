package com.lilcode.hellodagger.ContributesAndroidInjector

import android.os.Bundle
import android.util.Log
import com.lilcode.hellodagger.R
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Named

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    @Named("app")
    lateinit var appString: String

    @Inject
    @Named("activity")
    lateinit var activityString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        Log.e("MainActivity", appString)
        Log.e("MainActivity", activityString)

        /*
        2021-08-03 21:24:44.733 8407-8407/com.lilcode.hellodagger E/MainActivity: String from AppModule
        2021-08-03 21:24:44.733 8407-8407/com.lilcode.hellodagger E/MainActivity: String from MainActivityModule
         */

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment())
            .commit()

    }
}