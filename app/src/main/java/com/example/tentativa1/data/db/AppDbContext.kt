package com.example.tentativa1.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tentativa1.data.dao.UserDAO
import com.example.tentativa1.data.entity.User

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class AppDbContext : RoomDatabase() {

    abstract val userDAO: UserDAO

    companion object{
        @Volatile
        private var INSTANCE: AppDbContext? = null

         fun getDatabase(context: Context): AppDbContext {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDbContext::class.java,
                    "app_db"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                return instance
            }
        }
    }
}