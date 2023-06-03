package net.uniquecomputer.houseguru

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import net.uniquecomputer.houseguru.Adapter.CleaningServicesAdapter
import net.uniquecomputer.houseguru.Adapter.HomeApplianceServiceAdapter
import net.uniquecomputer.houseguru.Adapter.HomeMaintenanceAdapter
import net.uniquecomputer.houseguru.Adapter.HouseShiftingAdapter
import net.uniquecomputer.houseguru.Adapter.MostUseAdapter
import net.uniquecomputer.houseguru.Model.CleaningServicesModel
import net.uniquecomputer.houseguru.Model.HomeApplianceServiceModel
import net.uniquecomputer.houseguru.Model.HomeMaintenceModel
import net.uniquecomputer.houseguru.Model.HouseShiftingModel
import net.uniquecomputer.houseguru.databinding.FragmentServiceBinding

class Service : Fragment() {

    private lateinit var  binding : FragmentServiceBinding

    lateinit var homeMaintenanceAdapter: HomeMaintenanceAdapter
    private lateinit var homeMaintenanceArrayList : ArrayList<HomeMaintenceModel>

    private lateinit var houseShiftingAdapter: HouseShiftingAdapter
    private lateinit var houseShiftingArrayList: ArrayList<HouseShiftingModel>

    private lateinit var homeApplianceServiceAdapter: HomeApplianceServiceAdapter
    private lateinit var homeApplianceServiceArrayList: ArrayList<HomeApplianceServiceModel>

    private lateinit var cleaningServicesAdapter: CleaningServicesAdapter
    private lateinit var cleaningServicesArrayList: ArrayList<CleaningServicesModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentServiceBinding.inflate(layoutInflater,container,false)
        homeMaintenanceArrayList = ArrayList()
        homeMaintenanceArrayList.add(HomeMaintenceModel(R.drawable.painting,"Painting"))
        homeMaintenanceArrayList.add(HomeMaintenceModel(R.drawable.homesanitizing,"Home \n Sanitizing"))
        homeMaintenanceArrayList.add(HomeMaintenceModel(R.drawable.floorpolisher,"Floor Polishing"))
        homeMaintenanceArrayList.add(HomeMaintenceModel(R.drawable.plumber,"Plumber"))
        homeMaintenanceArrayList.add(HomeMaintenceModel(R.drawable.electrication,"Electrician"))
        homeMaintenanceArrayList.add(HomeMaintenceModel(R.drawable.carpenter,"Carpender"))



        houseShiftingArrayList = ArrayList()
        houseShiftingArrayList.add(HouseShiftingModel(R.drawable.homeshifting,"House \n Shifting"))
        houseShiftingAdapter = HouseShiftingAdapter(requireContext(),houseShiftingArrayList)
        binding.houseshifting.layoutManager = GridLayoutManager(requireContext(),3)
        binding.houseshifting.adapter = houseShiftingAdapter


        homeApplianceServiceArrayList = ArrayList()
        homeApplianceServiceArrayList.add(HomeApplianceServiceModel(R.drawable.fridge,"Fridge"))
        homeApplianceServiceArrayList.add(HomeApplianceServiceModel(R.drawable.acservice,"Ac Service"))
        homeApplianceServiceArrayList.add(HomeApplianceServiceModel(R.drawable.washingmachine,"Washing \n Machine"))
        homeApplianceServiceArrayList.add(HomeApplianceServiceModel(R.drawable.television,"Television"))
        homeApplianceServiceAdapter = HomeApplianceServiceAdapter(requireContext(),homeApplianceServiceArrayList)
        binding.homeapplianceservice.layoutManager = GridLayoutManager(requireContext(),3)
        binding.homeapplianceservice.adapter = homeApplianceServiceAdapter

        cleaningServicesArrayList = ArrayList()
        cleaningServicesArrayList.add(CleaningServicesModel(R.drawable.deepcleaning,"Deep \n Cleaning"))
        cleaningServicesArrayList.add(CleaningServicesModel(R.drawable.kitchencleaning,"Kitchen \n Cleaning"))
        cleaningServicesArrayList.add(CleaningServicesModel(R.drawable.homesanitizing,"Home \n Sanitizing"))
        cleaningServicesArrayList.add(CleaningServicesModel(R.drawable.cardetailing,"Car \n Detailing"))
        cleaningServicesArrayList.add(CleaningServicesModel(R.drawable.carsanitizing,"Car \n Sanitizing"))
        cleaningServicesAdapter = CleaningServicesAdapter(requireContext(),cleaningServicesArrayList)
        binding.cleaningservices.layoutManager = GridLayoutManager(requireContext(),3)
        binding.cleaningservices.adapter = cleaningServicesAdapter

        homeMaintenanceAdapter = HomeMaintenanceAdapter(requireContext(),homeMaintenanceArrayList)
        binding.homemaintenance.layoutManager = GridLayoutManager(requireContext(),3)
        binding.homemaintenance.adapter = homeMaintenanceAdapter
        return binding.root
    }



}