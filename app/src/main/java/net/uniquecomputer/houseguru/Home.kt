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
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

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
        mostusedarraylist.add(MostUseModel(R.drawable.deepcleaning,"Deep \n Cleaning"))
        mostusedarraylist.add(MostUseModel(R.drawable.kitchencleaning,"Kitchen \n Cleaning"))
        mostusedarraylist.add(MostUseModel(R.drawable.homesanitizing,"Home \n Sanitizing"))
        mostusedarraylist.add(MostUseModel(R.drawable.painting,"Painting"))
        mostusedarraylist.add(MostUseModel(R.drawable.floorpolisher,"Floor \n Polishing"))
        mostusedarraylist.add(MostUseModel(R.drawable.plumber,"Plumber"))
        mostusedarraylist.add(MostUseModel(R.drawable.homeshifting,"Home \n Shifting"))
        mostusedarraylist.add(MostUseModel(R.drawable.washingmachine,"Washing \n Machine"))
        mostusedarraylist.add(MostUseModel(R.drawable.carpenter,"Carpender"))
        mostusedarraylist.add(MostUseModel(R.drawable.fridge,"Fridge"))
        mostusedarraylist.add(MostUseModel(R.drawable.electrication,"Electrician"))

        mostUseAdapter = MostUseAdapter(requireContext(),mostusedarraylist)
        binding.mostusehomerv.layoutManager = GridLayoutManager(requireContext(),3)
//        binding.mostusehomerv.layoutManager = LinearLayoutManager(requireContext())
        binding.mostusehomerv.adapter = mostUseAdapter
        showsliderimage()
        return binding.root

    }

    private fun showsliderimage() {
        val carousel: ImageCarousel = binding.carousel

        carousel.addData(CarouselItem("https://t4.ftcdn.net/jpg/05/20/15/39/360_F_520153905_DpORx6OLESlfvdEBzHFMeDbnm8kxt67t.jpg"))
        carousel.addData(CarouselItem("https://www.netmeds.com/images/cms/offers/1603970376_Mobile_home_bannerfdhfhf.jpg"))
        carousel.addData(CarouselItem(R.drawable.sliderone))
        carousel.addData(CarouselItem(R.drawable.slidertwo))
        carousel.addData(CarouselItem(R.drawable.sliderthree))
        carousel.addData(CarouselItem(R.drawable.slidertwo))
        carousel.addData(CarouselItem(R.drawable.sliderfive))

    }


}