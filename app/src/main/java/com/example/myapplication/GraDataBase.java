package com.example.myapplication;

import androidx.room3.Database;
import androidx.room3.RoomDatabase;

@Database(entities = {Gra.class},version = 1)
public abstract class GraDataBase extends RoomDatabase {
    public abstract GraDAO zwrocGryDAO();
}
