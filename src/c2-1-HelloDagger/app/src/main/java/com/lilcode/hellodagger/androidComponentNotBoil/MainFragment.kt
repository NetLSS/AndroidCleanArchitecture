package com.lilcode.hellodagger.androidComponentNotBoil

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject
import javax.inject.Named

class MainFragment: Fragment() {

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
        2021-08-03 11:46:36.146 28214-28214/com.lilcode.hellodagger E/MainFragment: String from AppModule
        2021-08-03 11:46:36.146 28214-28214/com.lilcode.hellodagger E/MainFragment: String from MainActivityModule
        2021-08-03 11:46:36.146 28214-28214/com.lilcode.hellodagger E/MainFragment: String from fragment
         */
        super.onAttach(context)
    }
}
