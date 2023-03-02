package com.example.examenpmdm2evau

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenpmdm2evau.databinding.ActivityMovieDisplayBinding

class MovieDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_display)

        val binding = ActivityMovieDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movie = intent.getSerializableExtra("movie") as Movie

        binding.textoTitulo.text = "Titulo: ${movie.gettitulo()}"
        binding.textoDuracion.text = "Duración: ${movie.getduracion()}"
        binding.textoNombreDir.text = "Nombre director: ${movie.getNomDir()}"
        binding.textoAnoLan.text = "Año de Lanzamiento: ${movie.getanoLan()}"

        binding.BotonEmpezar.setOnClickListener() {
            val intent = Intent (this@MovieDisplayActivity, MainActivity::class.java )
            intent.putExtra("movie",movie)
            startActivity(intent)
        }

        binding.Favorita.setOnClickListener() {
            val intent = Intent (this@MovieDisplayActivity, FavoriteMoviesActivity::class.java )
            intent.putExtra("movie",movie)
            startActivity(intent)
        }
    }
}