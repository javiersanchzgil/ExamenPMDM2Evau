package com.example.examenpmdm2evau

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenpmdm2evau.databinding.ActivityFavoriteMoviesBinding
import com.example.examenpmdm2evau.databinding.ActivityMovieDetailsBinding

class FavoriteMoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_movies)

        val movie = intent.getSerializableExtra("movie") as Movie

        val binding = ActivityFavoriteMoviesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.PeliculaFavoritaTexto.text = "pelicula: ${movie.gettitulo()}"

    }
}