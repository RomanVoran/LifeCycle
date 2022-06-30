package com.example.lifecycle

import android.util.Log
import androidx.lifecycle.ViewModel

class Fragment1ViewModel : ViewModel() {
    
    var s = ""

    init {
        Log.d(Const.TAG, "Fragment1ViewModel init()")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(Const.TAG, "Fragment1ViewModel onCleared()")
    }

}