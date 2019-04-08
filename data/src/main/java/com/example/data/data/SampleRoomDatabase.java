package com.example.data.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.data.data.dao.SampleDao;
import com.example.data.models.SampleModel;

//When you modify the database schema, you'll need to update the version number and define how to handle migrations.
@Database(entities = {SampleModel.class}, version = 5, exportSchema = false)
public abstract class SampleRoomDatabase extends RoomDatabase {

    //list all the DAOs abstract function here so that they can be used in Repository
    public abstract SampleDao wordDao();

    //make this class a Singleton class so that only one instance of this class can be used fot the database operation
    private static SampleRoomDatabase INSTANCE;

    //return the same singleton instance every time
    public static SampleRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (SampleRoomDatabase.class) {
                if (INSTANCE == null) {
                    // Create database here
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            SampleRoomDatabase.class, "word_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }


}
