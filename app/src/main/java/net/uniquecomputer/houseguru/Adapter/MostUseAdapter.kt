package net.uniquecomputer.houseguru.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import net.uniquecomputer.houseguru.Home
import net.uniquecomputer.houseguru.Model.MostUseModel
import net.uniquecomputer.houseguru.databinding.SampledataBinding

class MostUseAdapter(private val content: Context, private val mostuseArrayList: ArrayList<MostUseModel>) : RecyclerView.Adapter<MostUseAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: SampledataBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = SampledataBinding.inflate(LayoutInflater.from(content),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mostuseArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.binding.sampleimage.setImageResource(mostuseArrayList[position].image)
        holder.binding.sampletext.text = mostuseArrayList[position].title
        holder.itemView.setOnClickListener {

           Toast.makeText(content,"Click",Toast.LENGTH_LONG).show()

        }
    }

}

