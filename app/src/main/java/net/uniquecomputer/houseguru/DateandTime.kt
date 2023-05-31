package net.uniquecomputer.houseguru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.uniquecomputer.houseguru.databinding.ActivityDateandTimeBinding

class DateandTime : AppCompatActivity() {

    private lateinit var binding: ActivityDateandTimeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDateandTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}