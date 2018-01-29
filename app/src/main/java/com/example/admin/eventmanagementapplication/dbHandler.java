package com.example.admin.eventmanagementapplication;

import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

public class dbHandler extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Event.db";
    private static final String USERS = "Users";
    //Now make individual variables for each column in your database.
    private static final String COLUMN_ID = "Id";
    private static final String EMAIL = "Email";
    private static final String CPASSWORD = "ConfirmPassword";
    private static final String COLLEGE = "College";
    private static final String CITY = "City";
    private static final String MOBILE = "Mobile";
    private static final String USERNAME = "Username";
    private static final String PASSWORD = "Password";

    public dbHandler(View.OnClickListener context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super((Context) context, DATABASE_NAME  , factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query  = "CREATE TABLE " + USERS + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                USERNAME + " TEXT, " +
                PASSWORD + " TEXT, " +
                CPASSWORD + " TEXT, " +
                COLLEGE + " TEXT, " +
                CITY + " TEXT, " +
                MOBILE + " TEXT, " +
                EMAIL + " TEXT " +
                ");";
        db.execSQL(query);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {db.execSQL("DROP TABLE IF EXISTS" + USERS);
        onCreate(db);
    }
    public void addRow(User user)
    {
        ContentValues values = new ContentValues();
        values.put(USERNAME, user.getUsername());
        values.put(PASSWORD,user.getPassword());
        values.put(CPASSWORD, user.getCpass());
        values.put(COLLEGE,user.getCollege());
        values.put(CITY, user.getCity());
        values.put(MOBILE,user.getMobile());
        values.put(EMAIL,user.getEmail());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(USERS, null, values);
        db.close();

    }
    public void deleteRow(String username,String password )
    {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + USERS + " WHERE " +  USERNAME + " = \'" + username +  "\' AND " + PASSWORD + " = \'" + password + "\'");
    }
     public String print(String username ,String password) {
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + USERS + " WHERE " + USERNAME + " = \'" + username + "\' AND " + PASSWORD + " = \'" + password + "\'";

        //Cursor points to a location in your results
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();

        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex("Username")) != null && c.getString(c.getColumnIndex("Password")) != null) {
                dbString += c.getColumnIndex("Username");
                dbString += c.getColumnIndex("Password");
                dbString += "\n";
                c.moveToNext();
            }
            db.close();

        }
        return dbString;
    }



}
