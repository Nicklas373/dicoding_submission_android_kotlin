package com.android.dicodingsubmission

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ListAndroidAdapter(private val listAndroid: ArrayList<android>) : RecyclerView.Adapter<ListAndroidAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var andName: TextView = itemView.findViewById(R.id.and_list_name)
        var andDetail: TextView = itemView.findViewById(R.id.and_list_detail)
        var andLogo: ImageView = itemView.findViewById(R.id.and_list_logo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_android, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val and = listAndroid[position]
        Glide.with(holder.itemView.context)
            .load(and.image)
            .apply(RequestOptions().override(55, 55))
            .into(holder.andLogo)
        holder.andName.text = and.android_version
        holder.andDetail.text = and.detail
        holder.itemView.setOnClickListener{
           if (position == 0 ) {
               val context=holder.andLogo.context
               val intent = Intent( context, frame_ics::class.java)
               intent.putExtra("and_ver", "ics")
               intent.putExtra("and_name", holder.andName.text.toString())
               intent.putExtra("and_detail", holder.andDetail.text.toString())
               context.startActivity(intent)
           } else if (position == 1 ) {
               val context=holder.andLogo.context
               val intent = Intent( context, frame_ics::class.java)
               intent.putExtra("and_ver", "jb")
               intent.putExtra("and_name", holder.andName.text.toString())
               intent.putExtra("and_detail", holder.andDetail.text.toString())
               context.startActivity(intent)
           } else if (position == 2 ) {
               val context=holder.andLogo.context
               val intent = Intent( context, frame_ics::class.java)
               intent.putExtra("and_ver", "kk")
               intent.putExtra("and_name", holder.andName.text.toString())
               intent.putExtra("and_detail", holder.andDetail.text.toString())
               context.startActivity(intent)
           } else if (position == 3 ) {
               val context=holder.andLogo.context
               val intent = Intent( context, frame_ics::class.java)
               intent.putExtra("and_ver", "lp")
               intent.putExtra("and_name", holder.andName.text.toString())
               intent.putExtra("and_detail", holder.andDetail.text.toString())
               context.startActivity(intent)
           } else if (position == 4 ) {
               val context=holder.andLogo.context
               val intent = Intent( context, frame_ics::class.java)
               intent.putExtra("and_ver", "mm")
               intent.putExtra("and_name", holder.andName.text.toString())
               intent.putExtra("and_detail", holder.andDetail.text.toString())
               context.startActivity(intent)
           } else if (position == 5 ) {
               val context=holder.andLogo.context
               val intent = Intent( context, frame_ics::class.java)
               intent.putExtra("and_ver", "nougat")
               intent.putExtra("and_name", holder.andName.text.toString())
               intent.putExtra("and_detail", holder.andDetail.text.toString())
               context.startActivity(intent)
           } else if (position == 6 ) {
               val context=holder.andLogo.context
               val intent = Intent( context, frame_ics::class.java)
               intent.putExtra("and_ver", "oreo")
               intent.putExtra("and_name", holder.andName.text.toString())
               intent.putExtra("and_detail", holder.andDetail.text.toString())
               context.startActivity(intent)
           } else if (position == 7 ) {
               val context=holder.andLogo.context
               val intent = Intent( context, frame_ics::class.java)
               intent.putExtra("and_ver", "pie")
               intent.putExtra("and_name", holder.andName.text.toString())
               intent.putExtra("and_detail", holder.andDetail.text.toString())
               context.startActivity(intent)
           } else if (position == 8 ) {
               val context=holder.andLogo.context
               val intent = Intent( context, frame_ics::class.java)
               intent.putExtra("and_ver", "ten")
               intent.putExtra("and_name", holder.andName.text.toString())
               intent.putExtra("and_detail", holder.andDetail.text.toString())
               context.startActivity(intent)
           } else if (position == 9 ) {
               val context=holder.andLogo.context
               val intent = Intent( context, frame_ics::class.java)
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