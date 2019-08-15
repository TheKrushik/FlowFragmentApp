package com.example.flowfragmentapp.onbording


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.flowfragmentapp.LocalStorage
import com.example.flowfragmentapp.R
import kotlinx.android.synthetic.main.fragment_onboarding2.*


class Onboarding2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_onboarding2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment", "Onboarding2Fragment - onActivityCreated")

        btnStart.setOnClickListener {
            LocalStorage.isOnboard2 = true

            val navController: NavController? by lazy { activity?.findNavController(R.id.nav_host_fragment) }

//            navController?.navigate(R.id.action_global_flowFragment)
//            navController?.navigate(R.id.action_onboarding2Fragment_to_flowFragment2)
            navController?.navigate(Onboarding2FragmentDirections.actionOnboarding2FragmentToFlowFragment2(true))

//            navController?.navigate(FlowFragmentDirections.actionGlobalFlowFragment(true))

//            navController?.popBackStack()


        }
    }

}
