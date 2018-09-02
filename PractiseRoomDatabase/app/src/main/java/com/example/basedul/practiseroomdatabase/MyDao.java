package com.example.basedul.practiseroomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    public void addUser(User user);
    @Query("select * from user_info")
    public List<User> getUsers();
}

