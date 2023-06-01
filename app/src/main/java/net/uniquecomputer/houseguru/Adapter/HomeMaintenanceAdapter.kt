package net.uniquecomputer.houseguru.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import net.uniquecomputer.houseguru.Model.HomeMaintenceModel
import net.uniquecomputer.houseguru.databinding.SampledataBinding

class HomeMaintenanceAdapter (private val context: Context, private val homeMaintenanceArrayList: ArrayList<HomeMaintenceModel>): RecyclerView.Adapter<HomeMaintenanceAdapter.ViewHolder>(){


    inner class ViewHolder(val binding: SampledataBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = SampledataBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  homeMaintenanceArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.sampleimage.setImageResource(homeMaintenanceArrayList[position].image)
        holder.binding.sampletext.text = homeMaintenanceArrayList[position].title
        holder.itemView.setOnClickListener {

            Toast.makeText(context,"Click", Toast.LENGTH_LONG).show()

        }
    }


}