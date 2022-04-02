package org.d3if4043.assessment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.d3if4043.assessment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun tambah(view: View){
        val angkaSatu = binding.angkasatu.text.toString()
        val angkaDua = binding.angkadua.text.toString()
        val hasil = binding.jumlahhasil

        if (angkaSatu.equals("")){
            binding.angkasatu.error="Masukan Angka!"
        }else if (angkaDua.equals("")){
            binding.angkadua.error="Masukan Angka!"
        }else{
            val jumlah = angkaSatu.toDouble() + angkaDua.toDouble()
            hasil.text = jumlah.toString()
        }


    }

    fun kurang(view: View){
        val angkaSatu = binding.angkasatu.text.toString()
        val angkaDua = binding.angkadua.text.toString()
        val hasil = binding.jumlahhasil

        if (angkaSatu.equals("")){
            binding.angkasatu.error="Masukan Angka!"
        }else if (angkaDua.equals("")){
            binding.angkadua.error="Masukan Angka!"
        }else{
            val jumlah = angkaSatu.toDouble() - angkaDua.toDouble()
            hasil.text = jumlah.toString()
        }

    }

    fun kali(view: View){
        val angkaSatu = binding.angkasatu.text.toString()
        val angkaDua = binding.angkadua.text.toString()
        val hasil = binding.jumlahhasil

        if (angkaSatu.equals("")){
            binding.angkasatu.error="Masukan Angka!"
        }else if (angkaDua.equals("")){
            binding.angkadua.error="Masukan Angka!"
        }else{
            val jumlah = angkaSatu.toDouble() * angkaDua.toDouble()
            hasil.text = jumlah.toString()
        }

    }

    fun bagi(view: View){
        val angkaSatu = binding.angkasatu.text.toString()
        val angkaDua = binding.angkadua.text.toString()
        val hasil = binding.jumlahhasil

        if (angkaSatu.equals("")){
            binding.angkasatu.error="Masukan Angka!"
        }else if (angkaDua.equals("")){
            binding.angkadua.error="Masukan Angka!"
        }else{
            val jumlah = angkaSatu.toDouble() / angkaDua.toDouble()
            hasil.text = jumlah.toString()
        }

    }

    fun clear(view: View){
        val angkaSatu = findViewById<EditText>(R.id.angkasatu).text.clear()
        val angkaDua = findViewById<EditText>(R.id.angkadua).text.clear()
        var hasil = findViewById<TextView>(R.id.jumlahhasil)

        hasil.text = "0"


    }
}