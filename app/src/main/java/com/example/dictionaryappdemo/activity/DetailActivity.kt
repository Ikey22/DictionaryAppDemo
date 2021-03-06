package com.example.dictionaryappdemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dictionaryappdemo.R
import com.example.dictionaryappdemo.adapter.LetterAdapter
import com.example.dictionaryappdemo.adapter.WordAdapter
import com.example.dictionaryappdemo.databinding.ActivityDetailBinding
import com.example.dictionaryappdemo.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    companion object {
        const val LETTER = "letter"
        const val SEARCH_INDEX = "https://www.google.com/search?q="
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val letterId = intent?.extras?.getString(LETTER).toString()

        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerView
        // Sets the LinearLayoutManager of the recyclerview
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = WordAdapter(letterId, this)


    }
}