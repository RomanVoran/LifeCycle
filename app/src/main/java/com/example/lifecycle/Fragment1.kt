package com.example.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifecycle.Const.TAG

class Fragment1 : Fragment() {

    override fun onAttach(context: Context) {
        Log.d(TAG,"Fragment1 onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"Fragment1 onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        Log.d(TAG,"Fragment1 onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG,"Fragment1 onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }


    override fun onStart() {
        Log.d(TAG,"Fragment1 onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"Fragment1 onResume")
        super.onResume()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG,"Fragment1 onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d(TAG,"Fragment1 onViewStateRestored")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onPause() {
        Log.d(TAG,"Fragment1 onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"Fragment1 onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"Fragment1 onDestroy")
        super.onDestroy()
    }

    override fun onDestroyView() {
        Log.d(TAG,"Fragment1 onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d(TAG,"Fragment1 onDetach")
        super.onDetach()
    }
}