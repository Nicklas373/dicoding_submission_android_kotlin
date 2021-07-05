package com.android.dicodingsubmission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridAndroidAdapter(val listAndroid: ArrayList<android>) : RecyclerView.Adapter<GridAndroidAdapter.GridViewHolder>() {

    class GridViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var andLogo: ImageView = itemView.findViewById(R.id.and_grid_logo)
        var andName: TextView = itemView.findViewById(R.id.and_grid_name)
        var andDetail: TextView = itemView.findViewById(R.id.and_grid_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridAndroidAdapter.GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_android, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridAndroidAdapter.GridViewHolder, position: Int) {
        val and = listAndroid[position]
        Glide.with(holder.itemView.context)
            .load(listAndroid[position].image)
            .apply(RequestOptions().override(350, 550))
            .into(holder.andLogo)
        holder.andName.text = and.android_version
        holder.andDetail.text = and.detail
        holder.itemView.setOnClickListener {
            if (position == 0) {
                val context = holder.andLogo.context
                val intent = Intent(context, frame_ics::class.java)
                intent.putExtra("and_ver", "ics")
                intent.putExtra("and_name", holder.andName.text.toString())
                intent.putExtra("and_detail", holder.andDetail.text.toString())
                context.startActivity(intent)
            } else if (position == 1) {
                val context = holder.andLogo.context
                val intent = Intent(context, frame_ics::class.java)
                intent.putExtra("and_ver", "jb")
                intent.putExtra("and_name", holder.andName.text.toString())
                intent.putExtra("and_detail", holder.andDetail.text.toString())
                context.startActivity(intent)
            } else if (position == 2) {
                val context = holder.andLogo.context
                val intent = Intent(context, frame_ics::class.java)
                intent.putExtra("and_ver", "kk")
                intent.putExtra("and_name", holder.andName.text.toString())
                intent.putExtra("and_detail", holder.andDetail.text.toString())
                context.startActivity(intent)
            } else if (position == 3) {
                val context = holder.andLogo.context
                val intent = Intent(context, frame_ics::class.java)
                intent.putExtra("and_ver", "lp")
                intent.putExtra("and_name", holder.andName.text.toString())
                intent.putExtra("and_detail", holder.andDetail.text.toString())
                context.startActivity(intent)
            } else if (position == 4) {
                val context = holder.andLogo.context
                val intent = Intent(context, frame_ics::class.java)
                intent.putExtra("and_ver", "mm")
                intent.putExtra("and_name", holder.andName.text.toString())
                intent.putExtra("and_detail", holder.andDetail.text.toString())
                context.startActivity(intent)
            } else if (position == 5) {
                val context = holder.andLogo.context
                val intent = Intent(context, frame_ics::class.java)
                intent.putExtra("and_ver", "nougat")
                intent.putExtra("and_name", holder.andName.text.toString())
                intent.putExtra("and_detail", holder.andDetail.text.toString())
                context.startActivity(intent)
            } else if (position == 6) {
                val context = holder.andLogo.context
                val intent = Intent(context, frame_ics::class.java)
                intent.putExtra("and_ver", "oreo")
                intent.putExtra("and_name", holder.andName.text.toString())
                intent.putExtra("and_detail", holder.andDetail.text.toString())
                context.startActivity(intent)
            } else if (position == 7) {
                val context = holder.andLogo.context
                val intent = Intent(context, frame_ics::class.java)
                intent.putExtra("and_ver", "pie")
                intent.putExtra("and_name", holder.andName.text.toString())
                intent.putExtra("and_detail", holder.andDetail.text.toString())
                context.startActivity(intent)
            } else if (position == 8) {
                val context = holder.andLogo.context
                val intent = Intent(context, frame_ics::class.java)
                intent.putExtra("and_ver", "ten")
                intent.putExtra("and_name", holder.andName.text.toString())
                intent.putExtra("and_detail", holder.andDetail.text.toString())
                context.startActivity(intent)
            } else if (position == 9) {
                val context = holder.andLogo.context
                val intent = Intent(context, frame_ics::class.java)
                intent.putExtra("and_ver", "eleven")
                intent.putExtra("and_name", holder.andName.text.toString())
                intent.putExtra("and_detail", holder.andDetail.text.toString())
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return listAndroid.size
    }

}