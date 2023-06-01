package net.uniquecomputer.houseguru

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import net.uniquecomputer.houseguru.Adapter.MostUseAdapter
import net.uniquecomputer.houseguru.Model.MostUseModel
import net.uniquecomputer.houseguru.databinding.FragmentHomeBinding

class Home : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var mostusedarraylist : ArrayList<MostUseModel>
    lateinit var mostUseAdapter: MostUseAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        mostusedarraylist = ArrayList()
        mostusedarraylist.add(MostUseModel(R.drawable.houseguru,"App Logo"))
        mostusedarraylist.add(MostUseModel(R.drawable.avtar,"Avtar"))
        mostusedarraylist.add(MostUseModel(R.drawable.cleaning,"Home \n Cleaning "))
        mostusedarraylist.add(MostUseModel(R.drawable.avtar,"Avtar"))
        mostusedarraylist.add(MostUseModel(R.drawable.cleaning,"Home \n Cleaning "))
        mostusedarraylist.add(MostUseModel(R.drawable.avtar,"Avtar"))
        mostusedarraylist.add(MostUseModel(R.drawable.cleaning,"Home \n Cleaning "))
        mostusedarraylist.add(MostUseModel(R.drawable.avtar,"Avtar"))
        mostusedarraylist.add(MostUseModel(R.drawable.cleaning,"Home \n Cleaning "))
        mostusedarraylist.add(MostUseModel(R.drawable.avtar,"Avtar"))
        mostusedarraylist.add(MostUseModel(R.drawable.cleaning,"Home \n Cleaning "))

        mostUseAdapter = MostUseAdapter(requireContext(),mostusedarraylist)
        //grid view 3 column
        binding.mostusehomerv.layoutManager = GridLayoutManager(requireContext(),3)
//        binding.mostusehomerv.layoutManager = LinearLayoutManager(requireContext())
        binding.mostusehomerv.adapter = mostUseAdapter
        return binding.root

    }






}