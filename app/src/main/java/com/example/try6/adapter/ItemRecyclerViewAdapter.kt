package com.example.try6.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.try6.R
import com.example.try6.model.ItemModel

class ItemRecyclerViewAdapter(private val mList: List<ItemModel>) : RecyclerView.Adapter<ItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int ) {
        val itemModel = mList[position]
        holder.imageView.setImageResource(itemModel.image)
        holder.textView.text = itemModel.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = this.itemView.findViewById(R.id.itemIcon)
        val textView: TextView = this.itemView.findViewById(R.id.itemTitle)
    }
}