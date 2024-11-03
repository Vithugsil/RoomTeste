package com.example.tentativa1.data.db

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tentativa1.data.dao.UserDAO
import com.example.tentativa1.data.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDbContext : RoomDatabase() {

    abstract val userDAO: UserDAO

    companion object {

        fun getDatabase(application: Application): AppDbContext {
            return Room.databaseBuilder(
                application,
                AppDbContext::class.java,
                "app_db"
            ).fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build()
        }

    }
}
