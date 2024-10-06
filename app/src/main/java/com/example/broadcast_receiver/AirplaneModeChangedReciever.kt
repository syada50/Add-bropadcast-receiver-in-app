package com.example.broadcast_receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReciever: BroadcastReceiver()  {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action==Intent.ACTION_AIRPLANE_MODE_CHANGED){

            Toast.makeText(context,"Airplane mode is changed",Toast.LENGTH_SHORT).show()
        }
    }
}