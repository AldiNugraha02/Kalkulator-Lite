package org.d3if0144.kalkulatorlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if0144.kalkulatorlite.databinding.ActivityMain2Binding
import org.d3if0144.kalkulatorlite.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val bilangan = intent.getIntExtra("bil1", 0).toString() + " " + intent.getStringExtra("x") + " " +intent.getIntExtra("bil2", 0).toString()

        binding.bilangan.text = bilangan

        binding.result.text = intent.getIntExtra("result", 0).toString()

    }
}