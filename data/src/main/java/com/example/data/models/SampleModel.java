package com.example.data.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

//this is an entity class in ROOM which means a table in the SQLite database.
//Annotations identify how each part of this class relates to an entry in the database.
@Entity(tableName = "sample_table")
public class SampleModel {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "sample_id")
    private int sampleId;

    public SampleModel() {
    }

    public SampleModel(int wordId) {
        this.sampleId = wordId;
    }

    public void setSampleId(int id) {
        this.sampleId = id;
    }


    public int getSampleId() {
        return this.sampleId;
    }


}
