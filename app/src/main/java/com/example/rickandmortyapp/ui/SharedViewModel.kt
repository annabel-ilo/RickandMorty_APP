package com.example.rickandmortyapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmortyapp.api.Repository
import com.example.rickandmortyapp.api.model.CharacterList
import kotlinx.coroutines.launch
import retrofit2.Response

class SharedViewModel(val repository: Repository):ViewModel() {

    var listCharacters = MutableLiveData<Response<CharacterList>>()

    fun getCharacters(page:Int){
        viewModelScope.launch {
            val characters = repository.getCharacters(page)
            listCharacters.value = characters
            isFilter.value = true
        }
    }

    fun getByStatus(status : String, page: Int){
        viewModelScope.launch {
            val characters = repository.getCharactersByStatus(status, page)
            listCharacters.value = characters
            isFilter.value = true
        }
    }

    fun getByGender(gender: String, page: Int){
        viewModelScope.launch {
            val characters = repository.getCharactersByGender(gender, page)
            listCharacters.value = characters
            isFilter.value = true
        }
    }

    fun getByName(name: String){
        viewModelScope.launch {
            val characters = repository.getCharactersByName(name)
            listCharacters.value = characters
            isFilter.value = true
        }
    }

}