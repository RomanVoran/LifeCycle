package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Const.TAG, "Activity2 onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.d(Const.TAG, "Activity2 onCreate")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onStart() {
        Log.d(Const.TAG, "Activity2 onStart")
        super.onStart()
    }

    override fun onRestart() {
        Log.d(Const.TAG, "Activity2 onRestart")
        super.onRestart()
    }
    
    override fun onResume() {
        Log.d(Const.TAG, "Activity2 onResume")
        super.onResume()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(Const.TAG, "Activity2 onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(Const.TAG, "Activity2 onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        Log.d(Const.TAG, "Activity2 onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }

    override fun onPause() {
        Log.d(Const.TAG, "Activity2 onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(Const.TAG, "Activity2 onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Const.TAG, "Activity2 onDestroy")
        super.onDestroy()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        Log.d(Const.TAG, "Activity2 onCreateOptionsMenu")
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}