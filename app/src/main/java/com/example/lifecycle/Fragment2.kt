package com.example.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment2 : Fragment() {

    override fun onAttach(context: Context) {
        Log.d(Const.TAG,"Fragment2 onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Const.TAG,"Fragment2 onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        Log.d(Const.TAG,"Fragment2 onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(Const.TAG,"Fragment2 onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }


    override fun onStart() {
        Log.d(Const.TAG,"Fragment2 onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(Const.TAG,"Fragment2 onResume")
        super.onResume()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(Const.TAG,"Fragment2 onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d(Const.TAG,"Fragment2 onViewStateRestored")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onPause() {
        Log.d(Const.TAG,"Fragment2 onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(Const.TAG,"Fragment2 onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Const.TAG,"Fragment2 onDestroy")
        super.onDestroy()
    }

    override fun onDestroyView() {
        Log.d(Const.TAG,"Fragment2 onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d(Const.TAG,"Fragment2 onDetach")
        super.onDetach()
    }
}