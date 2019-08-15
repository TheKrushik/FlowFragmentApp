package com.example.flowfragmentapp


import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_flow.*
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController


class FlowFragment : Fragment()/*, BottomNavigationView.OnNavigationItemSelectedListener*/ {


//    private val mainNavController: NavController? by lazy { activity?.findNavController(R.id.nav_host_child) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_flow, container, false)

//        val navHost = NavHostFragment.create(R.navigation.container_graph)
//        childFragmentManager
//                .beginTransaction()
//                .replace(R.id.fragmentContainer, navHost )
//                .setPrimaryNavigationFragment(navHost)
//                .commit()


        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment", "FlowFragment - onActivityCreated")
//        setupNavigationListener()
        setupNavigation()

        val args = FlowFragmentArgs.fromBundle(arguments!!)

        if (args.detail) {
//            val navControllerChild: NavController? by lazy { activity?.findNavController(R.id.nav_host_child) }
//            navControllerChild?.navigate(StartFragmentDirections.actionStartFragmentToDetailFragment())
            activity?.findNavController(R.id.nav_host_child)?.navigate(StartFragmentDirections.actionStartFragmentToDetailFragment())
        }

    }

    private fun setupNavigation() {
        val navController = Navigation.findNavController(activity!!, R.id.nav_host_child)
        bottomNavigation.setupWithNavController(navController)
    }

//    private fun setupNavigationListener() {
//        bottomNavigation.setOnNavigationItemSelectedListener(this)
//        bottomNavigation.selectedItemId = R.id.nav_start
////        navigation.menu.getItem(2).isChecked = true
//
//    }

//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.settingsFragment -> {
////                mainNavController?.navigate(R.id.settingsFragment)
//                Toast.makeText(context, "nav_settings", Toast.LENGTH_SHORT).show()
//            }
//            R.id.startFragment -> {
////                mainNavController?.navigate(R.id.startFragment)
//                Toast.makeText(context, "nav_start", Toast.LENGTH_SHORT).show()
//            }
//            R.id.calendarFragment -> {
////                mainNavController?.navigate(R.id.calendarFragment)
//                Toast.makeText(context, "nav_calendar", Toast.LENGTH_SHORT).show()
//            }
//            R.id.menuFragment -> {
////                mainNavController?.navigate(R.id.menuFragment)
//                Toast.makeText(context, "nav_menu", Toast.LENGTH_SHORT).show()
//            }
//        }
//        return true
//    }


}
