package com.edpub.tablayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

//R.id.something or R.drawable.something etc are actually unique integers corresponding to views

class ViewPagerAdapter(private var images : List<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>(){
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var ivImage: ImageView = view.findViewById(R.id.ivImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewpageritem, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image = images[position]
        holder.ivImage.setImageResource(image)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}