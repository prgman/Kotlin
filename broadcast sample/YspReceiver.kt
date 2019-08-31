package com.sangpil.broad

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast



class YspReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        if (intent.action.equals(Intent.ACTION_SCREEN_ON)) {
            Toast.makeText(context, "SCREEN_ON", Toast.LENGTH_SHORT).show()

        } else if (intent.action.equals(Intent.ACTION_SCREEN_OFF)) {
            Toast.makeText(context, "SCREEN_OFF", Toast.LENGTH_SHORT).show()

        } else if (intent.action.equals(Intent.ACTION_BOOT_COMPLETED)) {
//            var x = 10
//            while(x > 0) {
                Toast.makeText(context, "BOOT_COMPLETED", Toast.LENGTH_SHORT).show()
  //              Thread.sleep(2000L)
 //               x--
 //           }
            //val i = Intent(context, YspActivity::class.java)
            //context.startService(i)

        }
    }
}








