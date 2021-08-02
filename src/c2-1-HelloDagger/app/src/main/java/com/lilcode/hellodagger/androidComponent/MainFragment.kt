package com.lilcode.hellodagger.androidComponent

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.fragment.app.Fragment
import javax.inject.Inject
import javax.inject.Named

class MainFragment: Fragment() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var activityName: String

    @set: [Inject Named("randomNumber")]
    var randomNumber: Int? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (activity is MainActivity){
            (activity as MainActivity).getComponent()
                .mainFragmentComponentBuilder()
                .setModule(MainFragmentModule())
                .setFragment(this)
                .build()
                .inject(this)
        }

        Log.d("MainFragment", activityName)
        Log.d("MainFragment", "randomNUmber = $randomNumber")
        /*
        실행2
        2021-08-02 18:39:34.958 2853-2853/com.lilcode.hellodagger D/MainFragment: MainActivity
        2021-08-02 18:39:34.958 2853-2853/com.lilcode.hellodagger D/MainFragment: randomNUmber = -1329834136

        실행1
        2021-08-02 18:40:33.910 3342-3342/com.lilcode.hellodagger D/MainFragment: MainActivity
        2021-08-02 18:40:33.910 3342-3342/com.lilcode.hellodagger D/MainFragment: randomNUmber = -709593616
         */
    }
}
