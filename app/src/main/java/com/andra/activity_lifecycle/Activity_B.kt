package com.andra.activity_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.b_activity.*

class Activity_B : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.b_activity)
        Log.d(Activity_B::class.simpleName, "onCreate() dijalankan")

        Button2.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(Activity_B::class.simpleName, "onStart() dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Activity_B::class.simpleName, "onResume() dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Activity_B::class.simpleName, "onPause() dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Activity_B::class.simpleName, "onStop() dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Activity_B::class.simpleName, "onDestroy() dijalankan")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(Activity_B::class.simpleName, "onRestart() dijalankan")
    }
}