package net.uniquecomputer.houseguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                   true
                }
                R.id.service -> {
                    val intent = Intent(this, Services::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.wallet -> {
                    val intent = Intent(this, Wallet::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.booking -> {
                   val intent = Intent(this, Booking::class.java)
                        startActivity(intent)
                        overridePendingTransition(0, 0)
                        true
                }
                else -> false
            }
        }



    }
//
//    private fun replaceFragment() {
//        val fragmentManager = supportFragmentManager
//        val transaction = fragmentManager.beginTransaction()
//        transaction.replace(
//            androidx.fragment.R.id.fragment_container_view_tag, Wallet()
//        transaction.commit()
//    }

}