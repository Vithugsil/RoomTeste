package com.example.tentativa1

import android.app.Application
import com.example.tentativa1.data.db.AppDbContext
import com.example.tentativa1.data.entity.User

class AppApplication : Application() {

    lateinit var db: AppDbContext

    override fun onCreate() {
        super.onCreate()
        db = AppDbContext.getDatabase(this)
    }
}