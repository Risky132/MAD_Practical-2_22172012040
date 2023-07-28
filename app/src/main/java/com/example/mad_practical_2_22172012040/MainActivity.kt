package com.example.mad_practical_2_22172012040

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMassage("OnCreate method is called")
    }
    fun showMassage(massage : String)
    {
        Log.i(TAG, massage)
        Toast.makeText(this, massage, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showMassage("OnStart method is called")
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
    val TAG = "MainActivity"
}