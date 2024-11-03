package com.example.tentativa1.data.dao


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.tentativa1.data.entity.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDAO {

    @Upsert
    suspend fun insert(users: User)

    @Delete
    suspend fun delete(user: User)

    @Query("SELECT * FROM users ORDER BY first_name ASC")
    fun getAllOrderedByFirstName() : Flow<List<User>>

    @Query("SELECT * FROM users ORDER BY last_name ASC")
    fun getAllOrderedByLastName() : Flow<List<User>>

    @Query("SELECT * FROM users ORDER BY phone ASC")
    fun getAllOrderedByPhone() : Flow<List<User>>

}