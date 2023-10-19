package com.neta.tugas_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neta.tugas_menu.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nameinput = intent.getStringExtra("username")

        with(binding){
            name.setText("Halo " + nameinput +" !")
        }
    }
}