package com.example.broadcast_receiver

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val airplaneModeChangedReciever = AirplaneModeChangedReciever()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerReceiver(
            airplaneModeChangedReciever,
            IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        )

    }

    override fun onDestroy() {
        super.onDestroy()

        unregisterReceiver(airplaneModeChangedReciever)
    }

    }
