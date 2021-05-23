package com.example.rickandmortyapp.api

import com.example.rickandmortyapp.api.model.CharacterList
import retrofit2.Response

class Repository {

    suspend fun getCharacters(page:Int): Response<CharacterList>{
        return RetrofitInstance.api.getCharacters(page)
    }

    suspend fun getCharactersByStatusAndGender(status : String, gender: String, page:Int)
            :Response<CharacterList>{
        return RetrofitInstance.api.getCharactersbyStatusAndGender(status, gender, page)
    }

    suspend fun getCharactersByStatus(status: String, page: Int): Response<CharacterList>{
        return  RetrofitInstance.api.getCharactersByStatus(status, page)
    }

    suspend fun getCharactersByGender(gender: String, page: Int): Response<CharacterList>{
        return RetrofitInstance.api.getCharactersByGender(gender, page)
    }
    suspend fun getCharacterByName(name: String): Response<CharacterList>{
        return RetrofitInstance.api.getCharacterByName(name)
    }

}