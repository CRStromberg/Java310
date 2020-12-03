package com.example.transmissionline;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Table Name
    public static final String TABLE_NAME = "SPEAKERS";

    // Table columns
    public static final String _ID = "_id";
    public static final String PART_NUMBER = "partNumber";
    public static final String DIAMETER = "diameter";
    public static final String DEPTH = "depth";
    public static final String FS = "fs";
    public static final String SD = "sd";


    // Database Information
    static final String DB_NAME = "EXAMPLE_SPEAKERS.DB";

    // database version
    static final int DB_VERSION = 1;

    // Creating table query
    private static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" + _ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, " + PART_NUMBER + " TEXT NOT NULL, " + DIAMETER + " TEXT NOT NULL, "
            + DIAMETER + " TEXT NOT NULL, "+ DEPTH + " TEXT NOT NULL, "+ FS + " TEXT NOT NULL, "+ SD + " TEXT NOT NULL);";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
