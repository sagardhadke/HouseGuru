package net.uniquecomputer.houseguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import net.uniquecomputer.houseguru.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.show()
        val title = intent.getStringExtra("title")
        supportActionBar?.title = title

        //get the date and time and set in the setdata
        val date = intent.getStringExtra("date")
        val time = intent.getStringExtra("time")
        binding.setdata.text = "Date: $date \nTime: $time"

        //check if setData is null than hide text view
        if (date == null && time == null) {
            binding.setdata.visibility = android.view.View.GONE
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
                val intent = Intent(this, BookingSuccessfully::class.java)
                intent.putExtra("title", title)
                finish()
                startActivity(intent)
            }

        }

    }
}
