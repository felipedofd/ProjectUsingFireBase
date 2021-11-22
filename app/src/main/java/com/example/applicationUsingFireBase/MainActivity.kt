package com.example.applicationUsingFireBase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applicationUsingFireBase.databinding.ActivityMainBinding
import com.google.firebase.remoteconfig.FirebaseRemoteConfig

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val configBackground = FirebaseRemoteConfig.getInstance()
        if (configBackground.getBoolean("is_green")) {
            supportFragmentManager.beginTransaction()
                .replace(binding.containerMain.id, GreenFragment(), "green").commit()

        } else {
            supportFragmentManager.beginTransaction()
                .replace(binding.containerMain.id, RedFragment(), "red").commit()
        }

    }

}