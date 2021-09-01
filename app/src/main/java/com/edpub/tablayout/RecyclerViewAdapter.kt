package com.edpub.tablayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val list : List<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){


    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.rvItemTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.reycler_view_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currChapter = list[position]
        holder.itemView.findViewById<TextView>(R.id.rvItemTextView).text = currChapter
    }

    override fun getItemCount(): Int {
        return list.size
    }
}