package net.uniquecomputer.houseguru.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import net.uniquecomputer.houseguru.Details
import net.uniquecomputer.houseguru.Model.HomeApplianceServiceModel
import net.uniquecomputer.houseguru.databinding.SampledataBinding

class HomeApplianceServiceAdapter (private val context: Context, private val homeApplianceServiceArrayList : ArrayList<HomeApplianceServiceModel>): RecyclerView.Adapter<HomeApplianceServiceAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: SampledataBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = SampledataBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return homeApplianceServiceArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.sampleimage.setImageResource(homeApplianceServiceArrayList[position].image)
        holder.binding.sampletext.text = homeApplianceServiceArrayList[position].title
        holder.itemView.setOnClickListener {

            Toast.makeText(context,"Click", Toast.LENGTH_LONG).show()
            //open details activity
            val intent = Intent(context, Details::class.java)
            intent.putExtra("title",homeApplianceServiceArrayList[position].title)
            context.startActivity(intent)

        }
    }

}