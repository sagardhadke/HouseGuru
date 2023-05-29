package net.uniquecomputer.houseguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    // set default activity
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.service -> {
                    // Respond to navigation item 2 click
                    val intent = Intent(this, Services::class.java)
                    startActivity(intent)
                    true
                }
                R.id.wallet -> {
                    val intent = Intent(this, Wallet::class.java)
                    startActivity(intent)
                    true
                }
                R.id.booking -> {
                   val intent = Intent(this, Booking::class.java)
                        startActivity(intent)
                        true
                }
                else -> false
            }
        }

    }
}