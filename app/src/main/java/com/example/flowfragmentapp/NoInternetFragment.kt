package com.example.flowfragmentapp


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_no_internet.*


class NoInternetFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_no_internet, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment", "NoInternetFragment - onActivityCreated")

        btnRetry.setOnClickListener {
//            val navController = Navigation.findNavController(activity!!, R.id.nav_host_child)
            val navController: NavController? by lazy { activity?.findNavController(R.id.nav_host_fragment) }
            navController?.popBackStack()
        }
    }

}
