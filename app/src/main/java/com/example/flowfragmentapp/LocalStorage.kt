package com.example.flowfragmentapp

import com.orhanobut.hawk.Hawk

object LocalStorage {


    private const val KEY_PRIVACY_POLICY = "KEY_PRIVACY_POLICY"
    private const val KEY_SHOW_LANGUAGE = "KEY_SHOW_LANGUAGE"


    var isOnboard1: Boolean
        get() = Hawk.get(KEY_PRIVACY_POLICY, false)
        set(privacy) {
            Hawk.put(KEY_PRIVACY_POLICY, privacy)
        }

    var isOnboard2: Boolean
        get() = Hawk.get(KEY_SHOW_LANGUAGE, false)
        set(language) {
            Hawk.put(KEY_SHOW_LANGUAGE, language)
        }





}

