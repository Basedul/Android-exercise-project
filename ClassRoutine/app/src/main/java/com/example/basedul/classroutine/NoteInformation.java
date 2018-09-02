package com.example.basedul.classroutine;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "user_info")
public class NoteInformation {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private String title;
    @ColumnInfo
    private String Description;

    public NoteInformation() {
    }

    public NoteInformation(String title, String description) {

        this.title = title;
        Description = description;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return Description;
    }


}
