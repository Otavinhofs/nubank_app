package com.otavio.nubankapp.Recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.otavio.nubankapp.R

data class RvAdapter(val image: Int, val textCard: String)

class MyRvAdapter(private val itemList: List<RvAdapter>) : RecyclerView.Adapter<MyRvAdapter.RvViewHolder>() {

    class RvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rvImageView : ImageView = itemView.findViewById(R.id.imageAssets)
        val rvTextView : TextView = itemView.findViewById(R.id.textItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_itens, parent,  false)
        return RvViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size

    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        val rv = itemList[position]
        holder.rvImageView.setImageResource(rv.image)
        holder.rvTextView.setText(rv.textCard)
    }
}