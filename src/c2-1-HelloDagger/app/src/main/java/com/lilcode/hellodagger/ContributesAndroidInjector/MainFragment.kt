package com.lilcode.hellodagger.ContributesAndroidInjector

import android.content.Context
import android.util.Log
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.DaggerFragment
import javax.inject.Inject
import javax.inject.Named

class MainFragment : DaggerFragment() {
    @Inject
    @Named("app")
    lateinit var appString: String

    @Inject
    @Named("activity")
    lateinit var activityString: String

    @Inject
    @Named("fragment")
    lateinit var fragmentString: String

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)

        Log.e("MainFragment", appString)
        Log.e("MainFragment", activityString)
        Log.e("MainFragment", fragmentString)

        /*
        2021-08-03 21:24:44.912 8407-8407/com.lilcode.hellodagger E/MainFragment: String from AppModule
        2021-08-03 21:24:44.912 8407-8407/com.lilcode.hellodagger E/MainFragment: String from MainActivityModule
        2021-08-03 21:24:44.912 8407-8407/com.lilcode.hellodagger E/MainFragment: String from fragment
         */

        super.onAttach(context)
    }
}