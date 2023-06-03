package net.uniquecomputer.houseguru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.uniquecomputer.houseguru.databinding.ActivityDetailBinding

lateinit var binding : ActivityDetailBinding

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        actionBar?.show()
    }
}