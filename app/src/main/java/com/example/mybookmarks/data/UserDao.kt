package com.example.mybookmarks.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.mybookmarks.model.User

@Dao
interface UserDao{

    @Insert(onConflict= OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User): Void?

    @Update
    suspend fun updateUser(user:User): Void?

    @Delete
    suspend fun deletUser(user: User)

    @Query("DELETE FROM user_table")
    suspend fun deleteAllUsers()

    @Query("select * from user_table order by id")
    fun readAllData(): LiveData<List<User>>



}