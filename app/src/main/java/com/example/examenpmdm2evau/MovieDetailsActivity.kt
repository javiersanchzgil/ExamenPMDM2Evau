package com.example.examenpmdm2evau

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenpmdm2evau.databinding.ActivityMovieDetailsBinding

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val binding = ActivityMovieDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var nombreDir:String
        var anoLan:Int

        val movie = intent.getSerializableExtra("movie") as Movie

       // nombreDir = binding.cogerDir.text.toString()
        //anoLan = binding.cogerLanzamiento.text.toString().toInt()

        //movie.setNomDirec(nombreDir)
        //movie.setanoLan(anoLan)

        binding.botonAtras.setOnClickListener() {
            val intent = Intent (this@MovieDetailsActivity, MainActivity::class.java )
            intent.putExtra("movie",movie)
            startActivity(intent)
        }

        binding.botonContinuar2.setOnClickListener() {
            val intent = Intent (this@MovieDetailsActivity, MovieDisplayActivity::class.java )
            intent.putExtra("movie",movie)
            startActivity(intent)
        }


    }
}



