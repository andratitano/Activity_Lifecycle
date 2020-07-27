package com.andra.activity_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.simpleName, "onCreate() dijalankan")

        Button1.setOnClickListener {
            startActivity(Intent(applicationContext, Activity_B::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.simpleName, "onStart() dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity::class.simpleName, "onResume() dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity::class.simpleName, "onPause() dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.simpleName, "onStop() dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.simpleName, "onDestroy() dijalankan")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity::class.simpleName, "onRestart() dijalankan")
    }
}