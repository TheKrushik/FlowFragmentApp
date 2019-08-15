package com.example.flowfragmentapp

import android.content.Context
import android.net.ConnectivityManager


class NetManager {

    @Suppress("DEPRECATION")
    fun isConnecting(context: Context?): Boolean {
        val connectManager = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }

}