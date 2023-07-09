package net.uniquecomputer.houseguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import net.uniquecomputer.houseguru.databinding.ActivityDetailsBinding
import java.util.UUID

class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.show()
        val title = intent.getStringExtra("title")
        supportActionBar?.title = title

        val date = intent.getStringExtra("date")
        val time = intent.getStringExtra("time")
        binding.setdata.text = "Date: $date \nTime: $time"

        if (date == null && time == null) {
            binding.setdata.visibility = android.view.View.GONE
        }else{
            (binding.setdata.visibility == android.view.View.VISIBLE)
            binding.button.text = "Change Date and Time"
        }

        binding.button.setOnClickListener {

            val intent = Intent(this, DateandTime::class.java)
            intent.putExtra("title", title)
            startActivity(intent)

        }

        binding.continueDetails.setOnClickListener {

            if (binding.address.text.toString().length < 50) {
                binding.address.error = "Address is required"
                Toast.makeText(this, "Address Must Be 50 Character", Toast.LENGTH_SHORT).show()
                binding.address.requestFocus()
            } else if (binding.name.text.toString().isEmpty()) {
                binding.name.error = "Name is required"
                Toast.makeText(this, "Name is required", Toast.LENGTH_SHORT).show()
                binding.name.requestFocus()
            } else if (binding.number.text.toString().length < 10){
                binding.number.error = "Number is required"
                Toast.makeText(this, "Number Must Be 10 Character", Toast.LENGTH_SHORT).show()
                binding.number.requestFocus()
            } else {
                val orderid = UUID.randomUUID().toString().substring(0, 18)
                val image = intent.getIntExtra("image", 0)
                val intent = Intent(this, BookingSuccessfully::class.java)
                intent.putExtra("title", title)
                intent.putExtra("date", date)
                intent.putExtra("image", image)
                intent.putExtra("orderid", orderid)
                finish()
                startActivity(intent)
            }

        }

    }

}