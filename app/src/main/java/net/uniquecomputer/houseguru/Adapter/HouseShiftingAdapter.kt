package net.uniquecomputer.houseguru.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import net.uniquecomputer.houseguru.Details
import net.uniquecomputer.houseguru.Model.HouseShiftingModel
import net.uniquecomputer.houseguru.databinding.SampledataBinding

class HouseShiftingAdapter (private val context: Context, private val houseShiftingArrayList: ArrayList<HouseShiftingModel>): RecyclerView.Adapter<HouseShiftingAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: SampledataBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = SampledataBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  houseShiftingArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.sampleimage.setImageResource(houseShiftingArrayList[position].image)
        holder.binding.sampletext.text = houseShiftingArrayList[position].title
        holder.itemView.setOnClickListener {

            Toast.makeText(context,"Click", Toast.LENGTH_LONG).show()
            //open details activity
            val intent = Intent(context, Details::class.java)
            intent.putExtra("title",houseShiftingArrayList[position].title)
            context.startActivity(intent)

        }
    }

}