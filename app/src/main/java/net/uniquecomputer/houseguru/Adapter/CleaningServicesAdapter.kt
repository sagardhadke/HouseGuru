package net.uniquecomputer.houseguru.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import net.uniquecomputer.houseguru.Model.CleaningServicesModel
import net.uniquecomputer.houseguru.databinding.SampledataBinding

class CleaningServicesAdapter (private val context: Context, private val cleaningServicesArrayList: ArrayList<CleaningServicesModel>): RecyclerView.Adapter<CleaningServicesAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: SampledataBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = SampledataBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return cleaningServicesArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.sampleimage.setImageResource(cleaningServicesArrayList[position].image)
        holder.binding.sampletext.text = cleaningServicesArrayList[position].title
        holder.itemView.setOnClickListener {

            Toast.makeText(context,"Click", Toast.LENGTH_LONG).show()

        }
    }

}