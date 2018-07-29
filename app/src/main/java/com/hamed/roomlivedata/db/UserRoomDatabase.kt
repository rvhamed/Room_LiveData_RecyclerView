package com.hamed.roomlivedata.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class],version = 1)
abstract class UserRoomDatabase : RoomDatabase(){

    abstract fun userDao(): UserDao
    companion object {
        private var sInstance : UserRoomDatabase? = null
        fun getDatabase(context : Context): UserRoomDatabase{
            if (sInstance==null){
                synchronized(RoomDatabase::class.java){
                    if (sInstance==null){
                        sInstance = Room.databaseBuilder(context.applicationContext,UserRoomDatabase::class.java,"user_db").build()
                    }
                }

            }
            return sInstance!!
        }


    }
}