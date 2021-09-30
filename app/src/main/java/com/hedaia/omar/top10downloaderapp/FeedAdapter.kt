package com.hedaia.omar.top10downloaderapp

import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.allViews
import androidx.recyclerview.widget.RecyclerView
import com.hedaia.omar.top10downloaderapp.databinding.RvFeedItemBinding

class FeedAdapter (private val items:ArrayList<FeedEntry>): RecyclerView.Adapter<FeedAdapter.MyViewHolder>() {
    class MyViewHolder(val binding: RvFeedItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(RvFeedItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val title =items[position].name
        holder.binding.apply {
            tvFeed.text = title
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }




}