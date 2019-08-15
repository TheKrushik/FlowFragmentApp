package com.example.flowfragmentapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation


class MainActivity : AppCompatActivity() {

    private var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        loadOnboard()
    }


    private fun loadOnboard() {
        when {
            !LocalStorage.isOnboard1 -> navController?.navigate(R.id.action_global_onboarding1Fragment)
            !LocalStorage.isOnboard2 -> navController?.navigate(R.id.action_global_onboarding2Fragment)
//            !LocalStorage.isOnboard1 -> navController?.navigate(R.id.onboarding1Fragment)
//            !LocalStorage.isOnboard2 -> navController?.navigate(R.id.onboarding2Fragment)

//            else -> /*if (!BuildConfig.DEBUG)*/ initAdInterstitial()
        }

//        loadNotification()
    }
}
