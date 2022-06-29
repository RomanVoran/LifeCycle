package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu
import com.example.lifecycle.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Const.TAG, "Activity1 onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.d(Const.TAG, "Activity1 onCreate")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onStart() {
        Log.d(Const.TAG, "Activity1 onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(Const.TAG, "Activity1 onResume")
        super.onResume()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        Log.d(Const.TAG, "Activity1 onSaveInstanceState")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(Const.TAG, "Activity1 onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        Log.d(Const.TAG, "Activity1 onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }

    override fun onPause() {
        Log.d(Const.TAG, "Activity1 onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(Const.TAG, "Activity1 onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Const.TAG, "Activity1 onDestroy")
        super.onDestroy()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        Log.d(Const.TAG, "Activity1 onCreateOptionsMenu")
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}