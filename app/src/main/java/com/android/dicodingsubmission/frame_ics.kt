package com.android.dicodingsubmission

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class frame_ics : AppCompatActivity() {

    // Declare variable for textview and etc
    lateinit var android_name: TextView
    lateinit var android_detail: TextView
    lateinit var android_version: TextView
    lateinit var android_date: TextView
    lateinit var android_feature_1: TextView
    lateinit var android_feature_2: TextView
    lateinit var android_feature_3: TextView
    lateinit var android_logo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frame_ics_layout)

        // Passing data from last activity
        val and_ver = intent.extras!!.getString("and_ver")
        val and_name = intent.extras!!.getString("and_name")
        val and_detail = intent.extras!!.getString("and_detail")

        // Bind controller
        val android_name: TextView = findViewById(R.id.android_ver)
        val android_detail: TextView = findViewById(R.id.android_detail)
        val android_date: TextView = findViewById(R.id.and_date_txt)
        val android_version: TextView = findViewById(R.id.and_ver_txt)
        val android_feature_1: TextView = findViewById(R.id.and_feature_1_txt)
        val android_feature_2: TextView = findViewById(R.id.and_feature_2_txt)
        val android_feature_3: TextView = findViewById(R.id.and_feature_3_txt)
        val android_logo: ImageView = findViewById(R.id.and_logo)

        // Detect current android version from intent data
        if (and_ver == "ics"){
            supportActionBar?.title = "Ice Cream Sandwich"

            android_logo.setImageResource(R.drawable.ics)
            android_name.setText(and_name)
            android_detail.setText(and_detail)
            android_date.setText(resources.getString(R.string.android_ics_rel))
            android_version.setText(resources.getString(R.string.android_ics_version))
            android_feature_1.setText(resources.getString(R.string.android_ics_feature_1))
            android_feature_2.setText(resources.getString(R.string.android_ics_feature_2))
            android_feature_3.setText(resources.getString(R.string.android_ics_feature_3))
        } else if (and_ver == "jb") {
            supportActionBar?.title = "Jelly Bean"

            android_logo.setImageResource(R.drawable.jb)
            android_name.setText(and_name)
            android_detail.setText(and_detail)
            android_date.setText(resources.getString(R.string.android_jb_rel))
            android_version.setText(resources.getString(R.string.android_jb_version))
            android_feature_1.setText(resources.getString(R.string.android_jb_feature_1))
            android_feature_2.setText(resources.getString(R.string.android_jb_feature_2))
            android_feature_3.setText(resources.getString(R.string.android_jb_feature_3))
        } else if (and_ver == "kk") {
            supportActionBar?.title = "KitKat"

            android_logo.setImageResource(R.drawable.kk)
            android_name.setText(and_name)
            android_detail.setText(and_detail)
            android_date.setText(resources.getString(R.string.android_kk_rel))
            android_version.setText(resources.getString(R.string.android_kk_version))
            android_feature_1.setText(resources.getString(R.string.android_kk_feature_1))
            android_feature_2.setText(resources.getString(R.string.android_kk_feature_2))
            android_feature_3.setText(resources.getString(R.string.android_kk_feature_3))
        } else if (and_ver == "lp") {
            supportActionBar?.title = "Lollipop"

            android_logo.setImageResource(R.drawable.lp)
            android_name.setText(and_name)
            android_detail.setText(and_detail)
            android_date.setText(resources.getString(R.string.android_lp_rel))
            android_version.setText(resources.getString(R.string.android_lp_version))
            android_feature_1.setText(resources.getString(R.string.android_lp_feature_1))
            android_feature_2.setText(resources.getString(R.string.android_lp_feature_2))
            android_feature_3.setText(resources.getString(R.string.android_lp_feature_3))
        } else if (and_ver == "mm") {
            supportActionBar?.title = "Marshmallow"

            android_logo.setImageResource(R.drawable.mm)
            android_name.setText(and_name)
            android_detail.setText(and_detail)
            android_date.setText(resources.getString(R.string.android_mm_rel))
            android_version.setText(resources.getString(R.string.android_mm_version))
            android_feature_1.setText(resources.getString(R.string.android_mm_feature_1))
            android_feature_2.setText(resources.getString(R.string.android_mm_feature_2))
            android_feature_3.setText(resources.getString(R.string.android_mm_feature_3))
        } else if (and_ver == "nougat") {
            supportActionBar?.title = "Nougat"

            android_logo.setImageResource(R.drawable.nougat)
            android_name.setText(and_name)
            android_detail.setText(and_detail)
            android_date.setText(resources.getString(R.string.android_n_rel))
            android_version.setText(resources.getString(R.string.android_n_version))
            android_feature_1.setText(resources.getString(R.string.android_n_feature_1))
            android_feature_2.setText(resources.getString(R.string.android_n_feature_2))
            android_feature_3.setText(resources.getString(R.string.android_n_feature_3))
        } else if (and_ver == "oreo") {
            supportActionBar?.title = "Oreo"

            android_logo.setImageResource(R.drawable.oreo)
            android_name.setText(and_name)
            android_detail.setText(and_detail)
            android_date.setText(resources.getString(R.string.android_oreo_rel))
            android_version.setText(resources.getString(R.string.android_oreo_version))
            android_feature_1.setText(resources.getString(R.string.android_oreo_feature_1))
            android_feature_2.setText(resources.getString(R.string.android_oreo_feature_2))
            android_feature_3.setText(resources.getString(R.string.android_oreo_feature_3))
        } else if (and_ver == "pie") {
            supportActionBar?.title = "Pie"

            android_logo.setImageResource(R.drawable.pie)
            android_name.setText(and_name)
            android_detail.setText(and_detail)
            android_date.setText(resources.getString(R.string.android_pie_rel))
            android_version.setText(resources.getString(R.string.android_pie_version))
            android_feature_1.setText(resources.getString(R.string.android_pie_feature_1))
            android_feature_2.setText(resources.getString(R.string.android_pie_feature_2))
            android_feature_3.setText(resources.getString(R.string.android_pie_feature_3))
        } else if (and_ver == "ten") {
            supportActionBar?.title = "Android 10"

            android_logo.setImageResource(R.drawable.android_10)
            android_name.setText(and_name)
            android_detail.setText(and_detail)
            android_date.setText(resources.getString(R.string.android_ten_rel))
            android_version.setText(resources.getString(R.string.android_ten_version))
            android_feature_1.setText(resources.getString(R.string.android_ten_feature_1))
            android_feature_2.setText(resources.getString(R.string.android_ten_feature_2))
            android_feature_3.setText(resources.getString(R.string.android_ten_feature_3))
        } else if (and_ver == "eleven") {
            supportActionBar?.title = "Android 11"

            android_logo.setImageResource(R.drawable.android_11)
            android_name.setText(and_name)
            android_detail.setText(and_detail)
            android_date.setText(resources.getString(R.string.android_eleven_rel))
            android_version.setText(resources.getString(R.string.android_eleven_version))
            android_feature_1.setText(resources.getString(R.string.android_eleven_feature_1))
            android_feature_2.setText(resources.getString(R.string.android_eleven_feature_2))
            android_feature_3.setText(resources.getString(R.string.android_eleven_feature_3))
        }
    }
}