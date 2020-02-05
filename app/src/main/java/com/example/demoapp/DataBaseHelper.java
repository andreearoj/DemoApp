package com.example.demoapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="register.db";
    public static final String COL1_NAME="register.db";
    public static final String COL2_NAME="register.db";
    public static final String COL3_NAME="register.db";

    public DataBaseHelper(Context context){
        super(context, DATABASE_NAME, factory:null, version: 1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){

    }

}
