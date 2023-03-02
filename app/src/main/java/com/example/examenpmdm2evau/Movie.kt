package com.example.examenpmdm2evau

data class Movie (
    var titulo: String,
    var duracion: Int,
    var NomDirector: String,
    var anoLan: Int,

    ) : java.io.Serializable {


    fun gettitulo(): String {
        return titulo
    }

    fun settitulo(titulo: String) {
        this.titulo = titulo
    }

    fun getduracion(): Int {
        return duracion
    }

    fun setduracion(duracion: Int) {
        this.duracion = duracion
    }

    fun getNomDir(): String {
        return NomDirector
    }

    fun setNomDirec(NomDirector: String) {
        this.NomDirector = NomDirector
    }

    fun getanoLan(): Int {
        return anoLan
    }

    fun setanoLan(anoLan: Int) {
        this.anoLan = anoLan
    }

    constructor() : this("", 0, "",  0) {

    }
}





















