package com.example.flowfragmentapp.onbording


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.flowfragmentapp.LocalStorage

import com.example.flowfragmentapp.R
import kotlinx.android.synthetic.main.fragment_child_settings.*
import kotlinx.android.synthetic.main.fragment_onboarding1.*


class Onboarding1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_onboarding1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment", "Onboarding1Fragment - onActivityCreated")

        btnOnboarding1.setOnClickListener {
            LocalStorage.isOnboard1 = true

//            findNavController().navigate(R.id.action_global_onboarding2Fragment)
            findNavController().navigate(Onboarding2FragmentDirections.actionGlobalOnboarding2Fragment())

        }
    }

}
