package com.example.kotlin.mypokedexapp.data

import com.example.kotlin.mypokedexapp.data.network.NetworkModuleDI
import com.example.kotlin.mypokedexapp.data.network.model.PokedexObject
import com.example.kotlin.mypokedexapp.data.network.PokemonAPIService

class PokemonRepository() {
    private lateinit var api: PokemonAPIService

    suspend fun getPokemonList(limit:Int): com.example.kotlin.mypokedexapp.data.network.model.PokedexObject?{
        api = NetworkModuleDI()
        return try{
            api.getPokemonList(limit)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }

    suspend fun getPokemonInfo(numberPokemon:Int): com.example.kotlin.mypokedexapp.data.network.model.pokemon.Pokemon? {
        api = NetworkModuleDI()
        return try{
            api.getPokemonInfo(numberPokemon)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}