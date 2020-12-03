package com.example.transmissionline;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DBManager {

    private DatabaseHelper dbHelper;

    private Context context;

    private SQLiteDatabase database;

    public DBManager(Context c) {
        context = c;
    }

    public DBManager open() throws SQLException {
        dbHelper = new DatabaseHelper(context);
        database = dbHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        dbHelper.close();
    }

    public void insert(String partNumber, String diameter, String depth, String fs, String sd) {
        ContentValues contentValue = new ContentValues();
        contentValue.put(DatabaseHelper.PART_NUMBER, partNumber);
        contentValue.put(DatabaseHelper.DIAMETER, diameter);
        contentValue.put(DatabaseHelper.DEPTH, depth);
        contentValue.put(DatabaseHelper.FS, fs);
        contentValue.put(DatabaseHelper.SD, sd);
        database.insert(DatabaseHelper.TABLE_NAME, null, contentValue);
    }

    public Cursor fetch() {
        String[] columns = new String[] { DatabaseHelper._ID, DatabaseHelper.PART_NUMBER, DatabaseHelper.DIAMETER, DatabaseHelper.DEPTH, DatabaseHelper.FS, DatabaseHelper.SD };
        Cursor cursor = database.query(DatabaseHelper.TABLE_NAME, columns, null, null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        return cursor;
    }

    public int update(long _id, String partNumber, String diameter, String depth, String fs, String sd) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.PART_NUMBER, partNumber);
        contentValues.put(DatabaseHelper.DIAMETER, diameter);
        contentValues.put(DatabaseHelper.DEPTH, depth);
        contentValues.put(DatabaseHelper.FS, fs);
        contentValues.put(DatabaseHelper.SD, sd);
        int i = database.update(DatabaseHelper.TABLE_NAME, contentValues, DatabaseHelper._ID + " = " + _id, null);
        return i;
    }

    public void delete(long _id) {
        database.delete(DatabaseHelper.TABLE_NAME, DatabaseHelper._ID + "=" + _id, null);
    }

}

