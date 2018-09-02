package com.example.basedul.practiseroomdatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "user_info")
public class User {
    @PrimaryKey
    private int id;
    @ColumnInfo
    private String title;
    @ColumnInfo
    private String description;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {return id;}

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
