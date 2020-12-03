package com.example.finalproject;

import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;

public class myDbAdapter {
    myDbAdapter myhelper;

    public myDbAdapter(Context context)
    {
        myhelper = new myDbAdapter(context);
    }

    public long insertData(String prtNum)
    {
        SQLiteDatabase dbb = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.PARTNUMBER, prtNum );
        long id = dbb.insert(myDbHelper.TABLE_NAME, null , contentValues);
        return id;
    }


    public String getData()
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] columns = {myDbHelper.UID,myDbHelper.PARTNUMBER};
        Cursor cursor =db.query(myDbHelper.TABLE_NAME,columns,null,null,null,null,null);
        StringBuffer buffer= new StringBuffer();
        while (cursor.moveToNext())
        {
            int cid =cursor.getInt(cursor.getColumnIndex(myDbHelper.UID));
            String partNumber =cursor.getString(cursor.getColumnIndex(myDbHelper.PARTNUMBER));
            buffer.append(cid+ "   " + partNumber + " \n");
        }
        return buffer.toString();
    }


    static class myDbHelper extends SQLiteOpenHelper {
        private static final String DATABASE_NAME = "myDatabase";    // Database Name
        private static final String TABLE_NAME = "myTable";   // Table Name
        private static final int Version_NAME = 1;.    // Database Version
        private static final String UID="_id";     // Column I (Primary Key)
        private static final String PARTNUMBER = "Part";    //Column II
        private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+ " ("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+ PARTNUMBER +" VARCHAR(255) ,";
        private static final String DROP_TABLE ="DROP TABLE IF EXISTS "+TABLE_NAME;

        private Context context;

        public myDbHelper(Context context) {
            super(context, DATABASE_NAME, null, Version_NAME);
            this.context = context;
        }
        public void onCreate(SQLiteDatabase db) {

            try {
                db.execSQL(CREATE_TABLE);
            } catch (Exception e) {
                Message.message(context,""+e);
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {
                Message.message(context,"OnUpgrade");
                db.execSQL(DROP_TABLE);
                onCreate(db);
            }catch (Exception e) {
                Message.message(context, "" + e);
            }
    }
}
