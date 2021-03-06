package com.example.rickandmortyapp.api.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    var id: Int,
    var name: String,
    var Status: String,
    var species: String,
    var gender: String,
    var origin: LocationData,
    var location: LocationData,
    var image: String,
    var episodes: List<String>
): Parcelable
