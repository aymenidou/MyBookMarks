package com.example.mybookmarks.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName="user_table")
data class User(
    @PrimaryKey(autoGenerate=true)
    val id: Int,
    val nom: String,
    val prenom: String,
    val age: Int

):Parcelable