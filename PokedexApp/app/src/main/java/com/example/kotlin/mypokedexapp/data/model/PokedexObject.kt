package com.example.kotlin.mypokedexapp.model

import com.google.gson.annotations.SerializedName

data class PokedexObject(
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: ArrayList<PokemonBase>,
)