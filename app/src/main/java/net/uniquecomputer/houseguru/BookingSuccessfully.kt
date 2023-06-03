package net.uniquecomputer.houseguru
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import net.uniquecomputer.houseguru.databinding.ActivityBookingSuccessfullyBinding

class BookingSuccessfully : AppCompatActivity() {

  private lateinit var binding: ActivityBookingSuccessfullyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookingSuccessfullyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.show()
        val title = intent.getStringExtra("title")
        supportActionBar?.title = title

        val data = intent.getStringExtra("title")
        binding.servicename.text = data

        binding.done.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            finishAffinity()
            startActivity(intent)

        }

    }
}