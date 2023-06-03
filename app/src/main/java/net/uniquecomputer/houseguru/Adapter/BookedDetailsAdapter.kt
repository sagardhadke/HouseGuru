package net.uniquecomputer.houseguru.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.uniquecomputer.houseguru.Model.BookedDetailsModel
import net.uniquecomputer.houseguru.databinding.BookedserviceBinding

class BookedDetailsAdapter (private val context: Context, private val bookeddetailsarraylist: ArrayList<BookedDetailsModel>): RecyclerView.Adapter<BookedDetailsAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: BookedserviceBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = BookedserviceBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bookeddetailsarraylist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.bookedimg.setImageResource(bookeddetailsarraylist[position].image)
        holder.binding.bookedname.text = bookeddetailsarraylist[position].title
        holder.binding.bookeddate.text = bookeddetailsarraylist[position].daydate
        holder.binding.bookedorderid.text = bookeddetailsarraylist[position].orderid
        holder.itemView.setOnClickListener {

        }
    }

}