package com.android.dicodingsubmission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewAndroidAdapter(private val listAndroid: ArrayList<android>) : RecyclerView.Adapter<CardViewAndroidAdapter.CardViewViewHolder>() {
    class CardViewViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var andLogo: ImageView = itemView.findViewById(R.id.and_cv_logo)
        var andName: TextView = itemView.findViewById(R.id.and_cv_name)
        var andDetail: TextView = itemView.findViewById(R.id.and_cv_detail)
        var andFav: Button = itemView.findViewById(R.id.btn_set_favorite)
        var andShare: Button = itemView.findViewById(R.id.btn_set_share)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_android, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val and = listAndroid[position]
        Glide.with(holder.itemView.context)
            .load(and.image)
            .apply(RequestOptions().override(350, 550))
            .into(holder.andLogo)
        holder.andName.text = and.android_version
        holder.andDetail.text = and.detail
        holder.andFav.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + and.android_version, Toast.LENGTH_SHORT).show() }
        holder.andShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + and.android_version, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + and.android_version, Toast.LENGTH_SHORT).show()
            when (position) {
                0 -> {
                    val context = holder.andLogo.context
                    val intent = Intent(context, frame_ics::class.java)
                    intent.putExtra("and_ver", "ics")
                    intent.putExtra("and_name", holder.andName.text.toString())
                    intent.putExtra("and_detail", holder.andDetail.text.toString())
                    context.startActivity(intent)
                }
                1 -> {
                    val context = holder.andLogo.context
                    val intent = Intent(context, frame_ics::class.java)
                    intent.putExtra("and_ver", "jb")
                    intent.putExtra("and_name", holder.andName.text.toString())
                    intent.putExtra("and_detail", holder.andDetail.text.toString())
                    context.startActivity(intent)
                }
                2 -> {
                    val context = holder.andLogo.context
                    val intent = Intent(context, frame_ics::class.java)
                    intent.putExtra("and_ver", "kk")
                    intent.putExtra("and_name", holder.andName.text.toString())
                    intent.putExtra("and_detail", holder.andDetail.text.toString())
                    context.startActivity(intent)
                }
                3 -> {
                    val context = holder.andLogo.context
                    val intent = Intent(context, frame_ics::class.java)
                    intent.putExtra("and_ver", "lp")
                    intent.putExtra("and_name", holder.andName.text.toString())
                    intent.putExtra("and_detail", holder.andDetail.text.toString())
                    context.startActivity(intent)
                }
                4 -> {
                    val context = holder.andLogo.context
                    val intent = Intent(context, frame_ics::class.java)
                    intent.putExtra("and_ver", "mm")
                    intent.putExtra("and_name", holder.andName.text.toString())
                    intent.putExtra("and_detail", holder.andDetail.text.toString())
                    context.startActivity(intent)
                }
                5 -> {
                    val context = holder.andLogo.context
                    val intent = Intent(context, frame_ics::class.java)
                    intent.putExtra("and_ver", "nougat")
                    intent.putExtra("and_name", holder.andName.text.toString())
                    intent.putExtra("and_detail", holder.andDetail.text.toString())
                    context.startActivity(intent)
                }
                6 -> {
                    val context = holder.andLogo.context
                    val intent = Intent(context, frame_ics::class.java)
                    intent.putExtra("and_ver", "oreo")
                    intent.putExtra("and_name", holder.andName.text.toString())
                    intent.putExtra("and_detail", holder.andDetail.text.toString())
                    context.startActivity(intent)
                }
                7 -> {
                    val context = holder.andLogo.context
                    val intent = Intent(context, frame_ics::class.java)
                    intent.putExtra("and_ver", "pie")
                    intent.putExtra("and_name", holder.andName.text.toString())
                    intent.putExtra("and_detail", holder.andDetail.text.toString())
                    context.startActivity(intent)
                }
                8 -> {
                    val context = holder.andLogo.context
                    val intent = Intent(context, frame_ics::class.java)
                    intent.putExtra("and_ver", "ten")
                    intent.putExtra("and_name", holder.andName.text.toString())
                    intent.putExtra("and_detail", holder.andDetail.text.toString())
                    context.startActivity(intent)
                }
                9 -> {
                    val context = holder.andLogo.context
                    val intent = Intent(context, frame_ics::class.java)
                    intent.putExtra("and_ver", "eleven")
                    intent.putExtra("and_name", holder.andName.text.toString())
                    intent.putExtra("and_detail", holder.andDetail.text.toString())
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return listAndroid.size
    }
}