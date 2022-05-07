package com.example.mybookmarks.repository

import androidx.lifecycle.LiveData
import com.example.mybookmarks.data.UserDao
import com.example.mybookmarks.model.User

class UserRepository(private val userDao: UserDao){

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user : User){
        userDao.addUser(user)
    }

    suspend fun updateUser(user:User){
        userDao.updateUser(user)
    }

    suspend fun deletUser(user: User){
        userDao.deletUser(user)
    }

    suspend fun deletAllUsers(){
        userDao.deleteAllUsers()
    }
}