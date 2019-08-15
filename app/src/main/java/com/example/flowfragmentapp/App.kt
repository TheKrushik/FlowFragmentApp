package com.example.flowfragmentapp

import android.app.Application
import com.orhanobut.hawk.Hawk



class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initHawk()

    }


    private fun initHawk() { //LocalStorage
        Hawk.init(this).build()
    }


}