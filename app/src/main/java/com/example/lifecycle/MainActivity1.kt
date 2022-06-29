package com.example.lifecycle

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import com.example.lifecycle.Const.TAG
import com.example.lifecycle.databinding.ActivityMainBinding

class MainActivity1 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "Activity1 onCreate")
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.d(TAG, "Activity1 onCreate")
        super.onCreate(savedInstanceState, persistentState)
    }


    override fun onStart() {
        Log.d(TAG, "Activity1 onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "Activity1 onResume")
        super.onResume()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        Log.d(TAG, "Activity1 onSaveInstanceState")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "Activity1 onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        Log.d(TAG, "Activity1 onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }

    override fun onPause() {
        Log.d(TAG, "Activity1 onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "Activity1 onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "Activity1 onDestroy")
        super.onDestroy()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        Log.d(TAG, "Activity1 onCreateOptionsMenu")
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


}