package com.sangpil.flashlight

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val torch = Torch(this)

        flashSwitch.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
//                torch.flashOn()
                val intent = Intent(this, TorchService::class.java)
                intent.action = "on"
                startService(intent)
            }
            else
            {
//                torch.flashOff()
                startService(intentFor<TorchService>().setAction("off"))
            }
        }

    }
}
