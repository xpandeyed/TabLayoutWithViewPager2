package com.edpub.tablayout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//R.id.something or R.drawable.something etc are actually unique integers corresponding to views

class ViewPagerAdapter(private var adapterList : List<RecyclerViewAdapter>) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>(){
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var rvMyRecyclerView : RecyclerView = view.findViewById(R.id.myRecyclerView)
    }

    private lateinit var context : Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewpageritem, parent, false)
        context = parent.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currAdapter = adapterList[position]
        holder.rvMyRecyclerView.layoutManager = LinearLayoutManager(context)
        holder.rvMyRecyclerView.adapter = currAdapter
    }

    override fun getItemCount(): Int {
        return adapterList.size
    }
}