package com.example.admin.task;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class ExampleDB extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "sample_db";
    private static final String TABLE_NAME="Registration";
    public static final String NAME="Username";
    public static final String PASSWORD="Password";
    public static final String EMAIL="Email";
    public static final String NUMBER="Number";

    public ExampleDB(Context context) {
        super(context,DATABASE_NAME, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table "+TABLE_NAME+ "("

                + NAME + " TEXT,"

                + PASSWORD + " TEXT,"

                + EMAIL + " TEXT,"

                + NUMBER + " INT "

                + ")");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

        onCreate(sqLiteDatabase);


    }

    public void insert(String name, String password, String email, String phone) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put(NAME, name);

        contentValues.put(PASSWORD, password);

        contentValues.put(EMAIL, email);

        contentValues.put(NUMBER, phone);

        sqLiteDatabase.insert(TABLE_NAME,null, contentValues);
    }
}
