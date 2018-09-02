package com.example.basedul.classroutine;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    public void addUser(NoteInformation noteInformation);
    @Query("select * from user_info")
    public List<NoteInformation> getUsers();
}
