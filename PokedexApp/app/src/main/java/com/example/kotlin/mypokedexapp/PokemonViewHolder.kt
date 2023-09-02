package com.example.kotlin.mypokedexapp

import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.mypokedexapp.databinding.ItemPokemonBinding

class PokemonViewHolder(private val binding: ItemPokemonBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: PokemonBase){
        binding.TVName.text = item.name
    }
}