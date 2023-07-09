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

        val orderid = intent.getStringExtra("orderid")
        binding.orderiddetails.text = orderid

        val date = intent.getStringExtra("date")
        val image = intent.getIntExtra("image", 0)


        binding.done.setOnClickListener {
            val intent = Intent(this, Booking::class.java)
            val bundle = Bundle()

            //send data to Booking.kt fragment
            bundle.putString("title", title)
            bundle.putString("date", date)
            bundle.putString("image", image.toString())
            bundle.putString("orderid", orderid)
            intent.putExtras(bundle)
            finishAffinity()
            startActivity(intent)

        }

    }
}