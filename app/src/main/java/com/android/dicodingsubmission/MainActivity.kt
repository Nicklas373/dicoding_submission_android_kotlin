package com.android.dicodingsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAndroid: RecyclerView
    private var list: ArrayList<android> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // my_child_toolbar is defined in the layout file
        setSupportActionBar(findViewById(R.id.activity_main_toolbar))

        rvAndroid = findViewById(R.id.rv_android)
        rvAndroid.setHasFixedSize(true)

        list.addAll(androiddata.listData)
        showRecyclerList()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }

            R.id.action_grid -> {
                showRecyclerGrid()
            }

            R.id.action_card -> {
                showRecyclerCardView()
            }

            R.id.action_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun showRecyclerList() {
        rvAndroid.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListAndroidAdapter(list)
        rvAndroid.adapter = listHeroAdapter
    }

    private fun showRecyclerGrid() {
        rvAndroid.layoutManager = GridLayoutManager(this, 2)
        val gridAndroidAdapter = GridAndroidAdapter(list)
        rvAndroid.adapter = gridAndroidAdapter
    }

    private fun showRecyclerCardView() {
        rvAndroid.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewAndroidAdapter(list)
        rvAndroid.adapter = cardViewHeroAdapter
    }
}