package com.example.rickandmortyapp.api.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LocationData(
    var name: String
):Parcelable
