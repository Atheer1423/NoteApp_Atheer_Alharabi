package com.example.noteapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.SyncStateContract.Helpers.insert

class dbhelper(context: Context) :SQLiteOpenHelper(context,"notes.db",null,1){
   var sqLiteDatabase:SQLiteDatabase=writableDatabase
    override fun onCreate(db: SQLiteDatabase?) {
       if (db !=null){
           db.execSQL("create table notes (note text)")
       }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) { }
    fun addNote(note:String){
        val cv=ContentValues()
        cv.put("note",note)
        sqLiteDatabase.insert("notes",null,cv)
    }
}