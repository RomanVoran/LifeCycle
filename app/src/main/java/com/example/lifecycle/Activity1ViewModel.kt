package com.example.lifecycle

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.lifecycle.Const.TAG

class Activity1ViewModel : ViewModel() {

    var s = ""

    init {
        Log.d(TAG, "Activity1ViewModel init()")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "Activity1ViewModel onCleared()")
    }
}