package com.example.androidapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";
    private static final String DATABASE_NAME = "DataTable.db";
    private static final String TABLE_NAME = "data_table";

    private static final String COL1 = "ID";
    private static final String COL2 = "ROOMS";
    private static final String COL3 = "DEVICES";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);

    }


    public void onUpgrade(SQLiteDatabase db, int i, int i1){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);


    }

    public void onCreate(SQLiteDatabase db) {
      db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, ROOMS TEXT, DEVICES TEXT)");
    }

    public boolean insertData(String rooms, String devices){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, rooms);
        contentValues.put(COL3, devices);
        long result = db.insert(TABLE_NAME, null, contentValues);

        if(result == -1)
            return false;
        else
            return true;

    }

    public Cursor getRooms(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select ROOMS from " + TABLE_NAME, null);
        return res;

    }

}
