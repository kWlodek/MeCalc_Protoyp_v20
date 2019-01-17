package com.wlodek.mecalc_protoyp_v20;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MeCalc.db";
    public static final int DATABASE_VERSION = 1;

    private static final String COLUMN_KCAL = "Kcal";
    private static final String _ID = "ID";
    private static final String COLUMN_NAME = "Name";
    private static final String TABLE_NAME = "Info";

    public DBHelper(Context context,String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_MECALC_TABLE = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s INTEGER NOT NULL, );", Contract.DemoContent.TABLE_NAME, Contract.DemoContent._ID, Contract.DemoContent.COLUMN_NAME, Contract.DemoContent.COLUMN_KCAL);
        db.execSQL(SQL_CREATE_MECALC_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+Contract.DemoContent.TABLE_NAME);
        onCreate(db);
    }

    public boolean addData(String item){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NAME, item);

        Log.d(DATABASE_NAME, "Daten hinzufügen" + item + "zu" + TABLE_NAME);

        long result = db.insert(TABLE_NAME,null,contentValues);

        if (result == -1){
            return false;
        }else{
            return true;
        }
    }
}
