package com.example.examenpmdm2evau

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examenpmdm2evau.databinding.ActivityMovieTitleBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_title)


        val binding = ActivityMovieTitleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movie = Movie("",0,"",0)

        val titulo:String
        val duracion:Int

        //titulo = binding.cogerNombre.text.toString()
        //duracion = binding.cogerDura.text.toString().toInt()

        //movie.settitulo(titulo)
        //movie.setduracion(duracion)




        binding.botonContinuar.setOnClickListener(){
            val intent = Intent (this@MainActivity, MovieDetailsActivity::class.java )
            intent.putExtra("movie",movie)
            startActivity(intent)
        }




    }



}





































