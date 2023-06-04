package net.uniquecomputer.houseguru

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import net.uniquecomputer.houseguru.Adapter.BookedDetailsAdapter
import net.uniquecomputer.houseguru.Model.BookedDetailsModel
import net.uniquecomputer.houseguru.databinding.FragmentBookingBinding


class Booking : Fragment() {

    private lateinit var binding: FragmentBookingBinding
    private lateinit var bookeddetailsarraylist : ArrayList<BookedDetailsModel>
    lateinit var bookedDetailsAdapter: BookedDetailsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookingBinding.inflate(layoutInflater,container,false)

        bookeddetailsarraylist = ArrayList()

        val bundle = this.arguments
        val bookingid = bundle?.getString("orderid")
        val title = bundle?.getString("title")
        val date = bundle?.getString("date")
        val image = bundle?.getInt("image")
        val time = bundle?.getString("time")
        val dateandtime = "$date \n $time"

        bookeddetailsarraylist.add(BookedDetailsModel("Deep Cleaning",R.drawable.deepcleaning,"03/06/2023 \n 09:01","98845G679F441"))
        bookeddetailsarraylist.add(BookedDetailsModel(title!!,image!!,dateandtime,bookingid!!))

        bookedDetailsAdapter = BookedDetailsAdapter(requireContext(),bookeddetailsarraylist)
        binding.bookedservice.layoutManager = LinearLayoutManager(requireContext())
        binding.bookedservice.adapter = bookedDetailsAdapter
        return binding.root
    }

}