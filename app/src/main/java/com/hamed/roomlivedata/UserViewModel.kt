package com.hamed.roomlivedata

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.hamed.roomlivedata.db.User
import com.hamed.roomlivedata.db.UserRepository

class UserViewModel(application: Application) : AndroidViewModel(application) {

    private val mUserRepository : UserRepository = UserRepository(application)
    val allUser : LiveData<List<User>> = mUserRepository.getAllUser()
    fun insertUser(user: User) {
        mUserRepository.insertUser(user)
    }
    fun deleteUser(user: String){
        mUserRepository.deleteUser(user)
    }


}