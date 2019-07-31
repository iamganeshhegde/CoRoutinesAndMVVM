package com.example.coroutinesandmvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    var TAG = MainActivity::class.java.name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClick()




        /* This is coroutines
        Log.i(TAG,"Start")

        GlobalScope.launch {
            //launch a new coroutine
            delay(500)
            tvHelloWorld.setText("Hello");

        }

        tvHelloWorld.setText("World")
        runBlocking {
            delay(10000)
            Log.i(TAG,"Delay")

        }

        Log.i(TAG,"Stop")
*/
    }

    private fun onClick() {


        btnMVVM.setOnClickListener {

            startActivity(Intent(this,MVVMActivity::class.java))
        }

    }
}
