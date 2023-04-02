package org.d3if0144.kalkulatorlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if0144.kalkulatorlite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tambah.setOnClickListener {
            tambah()
        }

        binding.kurang.setOnClickListener {
            kurang()
        }

        binding.kali.setOnClickListener {
            kali()
        }

        binding.bagi.setOnClickListener {
            bagi()
        }

        binding.pangkat.setOnClickListener {
            pangkat()
        }
    }

    fun tambah(){
        val bil1 = binding.bi1EditText.text.toString().toInt()
        val bil2 = binding.bil2EditText.text.toString().toInt()
        val hasil = bil1 + bil2
        val result = Intent(this, MainActivity2::class.java).also {
            it.putExtra(
                "result",
                hasil
            )
            it.putExtra("bil1", bil1)
            it.putExtra("bil2", bil2)
            it.putExtra("x", "+")
        }
        startActivity(result)
    }

    fun kurang(){
        val bil1 = binding.bi1EditText.text.toString().toInt()
        val bil2 = binding.bil2EditText.text.toString().toInt()
        val hasil = bil1 - bil2
        val result = Intent(this, MainActivity2::class.java).also {
            it.putExtra(
                "result",
                hasil
            )
            it.putExtra("bil1", bil1)
            it.putExtra("bil2", bil2)
            it.putExtra("x","-")
        }
        startActivity(result)
    }

    fun kali(){
        val bil1 = binding.bi1EditText.text.toString().toInt()
        val bil2 = binding.bil2EditText.text.toString().toInt()
        val hasil = bil1 * bil2
        val result = Intent(this, MainActivity2::class.java).also {
            it.putExtra(
                "result",
                hasil
            )
            it.putExtra("bil1", bil1)
            it.putExtra("bil2", bil2)
            it.putExtra("x", "×")
        }
        startActivity(result)
    }

    fun bagi(){
        val bil1 = binding.bi1EditText.text.toString().toInt()
        val bil2 = binding.bil2EditText.text.toString().toInt()
        val hasil = bil1 / bil2
        val result = Intent(this, MainActivity2::class.java).also {
            it.putExtra(
                "result",
                hasil
            )
            it.putExtra("bil1", bil1)
            it.putExtra("bil2", bil2)
            it.putExtra("x", "÷")
        }
        startActivity(result)
    }

    fun pangkat(){
        val bil1 = binding.bi1EditText.text.toString().toInt()
        val bil2 = binding.bil2EditText.text.toString().toInt()
        var hasil = bil1
        for (i in 2..bil2){
            hasil = hasil*bil1
        }
        val result = Intent(this, MainActivity2::class.java).also {
            it.putExtra(
                "result",
                hasil
            )
            it.putExtra("bil1", bil1)
            it.putExtra("bil2", bil2)
            it.putExtra("x", "pangkat")
        }
        startActivity(result)
    }

}