package com.example.flowfragmentapp


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController


class CalendarFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_child_calendar, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment", "CalendarFragment - onActivityCreated")

        if (!NetManager().isConnecting(context)) {
            val mainNavController: NavController? by lazy { activity?.findNavController(R.id.nav_host_fragment) }
            mainNavController?.navigate(R.id.noInternetFragment)
        }
    }


}
