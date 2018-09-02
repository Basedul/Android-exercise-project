package com.example.basedul.practiseroomdatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = {User.class}, version = 1)
public abstract class MyappDatabase extends RoomDatabase {
    public abstract MyDao myDao();
}
