package com.example.recyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.recyclerview.Informacion
import com.example.recyclerview.R

class InformacionViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val nombreper =  view.findViewById<TextView>(R.id.tvNombre)
    val artistaper =  view.findViewById<TextView>(R.id.tvArtista)
    val duracionbreper =  view.findViewById<TextView>(R.id.tvDuracion)
    val imagen = view.findViewById<ImageView>(R.id.ivImagen)

    fun render(infoModel: Informacion){
        nombreper.text = infoModel.nombre
        duracionbreper.text = infoModel.duracion.toString()
        artistaper.text = infoModel.artista
        Glide.with(imagen.context).load(infoModel.imagen).into(imagen)


    }
}