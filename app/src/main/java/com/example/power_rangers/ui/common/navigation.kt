package com.example.power_rangers.ui.auth


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.power_rangers.R
import androidx.fragment.app.Fragment
import com.example.power_rangers.databinding.NavigationBinding
import com.example.power_rangers.ui.common.alert
import com.example.power_rangers.ui.common.home
import com.example.power_rangers.ui.common.location
import com.example.power_rangers.ui.common.profile


class Navigation : AppCompatActivity() {

    private lateinit var binding : NavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(home())

        binding.BottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.home -> replaceFragment(home())
                R.id.profile -> replaceFragment(profile())
                R.id.alert -> replaceFragment(alert())
                R.id.location -> replaceFragment(location())

                else ->{



                }

            }

            true

        }


    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout,fragment)
        fragmentTransaction.commit()


    }
}