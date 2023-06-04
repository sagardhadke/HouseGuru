package net.uniquecomputer.houseguru

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import net.uniquecomputer.houseguru.databinding.ActivityDateandTimeBinding

class DateandTime : AppCompatActivity() {

    private lateinit var binding: ActivityDateandTimeBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDateandTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.show()
        val title = intent.getStringExtra("title")
        supportActionBar?.title = title

        binding.datePicker.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->
            val date = "$dayOfMonth/${monthOfYear + 1}/$year"

            binding.timePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
                val time = "$hourOfDay:$minute"

                binding.continueBtn.setOnClickListener {
                    val intent = Intent(this, Details::class.java)
                    intent.putExtra("date", date)
                    intent.putExtra("time", time)
                    intent.putExtra("title", title)
                    startActivity(intent)
                    finish()
                }

            }

        }






    }
}