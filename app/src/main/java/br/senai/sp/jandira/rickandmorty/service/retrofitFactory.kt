package br.senai.sp.jandira.rickandmorty.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class retrofitFactory {

    private val BASE_ULR = "https://rickandmortyapi.com/api/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_ULR)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getCharacterService(): CharacterService {
        return retrofitFactory.create(CharacterService::class.java)


    }
}
