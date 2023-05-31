package net.uniquecomputer.houseguru

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.uniquecomputer.houseguru.databinding.ActivityMainBinding
import net.uniquecomputer.houseguru.databinding.FragmentHomeBinding

class Home : Fragment() {

private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)

        //set hint in search bar
        binding.searchbar.queryHint = "Search for a house"

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }





}