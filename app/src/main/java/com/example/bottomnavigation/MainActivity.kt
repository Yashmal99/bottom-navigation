package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val bottomNavigation:BottomNavigationView = findViewById(R.id.bottomnavigation)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val firstfragment = fragment1()
        openFragment(firstfragment)
    }
    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener()

        {
            when (it.itemId) {
                R.id.navigation_home -> {
                    val firstfragment = fragment1()
                    openFragment(firstfragment)
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigation_search -> {
                    val secondfragment = fragment2()
                    openFragment(secondfragment)
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigation_photo -> {
                    val thirdfragment = fragment3()
                    openFragment(thirdfragment)
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigation_likes -> {
                    val fourthfragment = fragment4()
                    openFragment(fourthfragment)
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigation_account -> {
                    val fifthfragment = fragment5()
                    openFragment(fifthfragment)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}

