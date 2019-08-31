package com.sangpil.broad

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Thread.sleep(3000L)
        Toast.makeText(this, "APK install Success.. ", Toast.LENGTH_SHORT).show()
//        Thread.sleep(3000L)
//        finish()
    }

}
