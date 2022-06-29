package com.example.lifecycle

import android.app.Application
import android.util.Log
import com.example.lifecycle.Const.TAG

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"app onCreate")
    }



}