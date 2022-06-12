package com.praktikum.mvpsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasilPsgPjg: TextView
    private lateinit var tvHasilPsg: TextView
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this)
        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasilPsgPjg = findViewById(R.id.tv_hasil_PP)
        tvHasilPsg = findViewById(R.id.tv_hasil_P)

        btnHitungLuas.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPjg(panjang, lebar)
            mainPresenter.hitungLuasPersegi(panjang)
        }
        btnHitungKeliling.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegiPjg(panjang, lebar)
            mainPresenter.hitungKelilingPersegi(panjang)
        }
    }

    override fun updateLuasP(luas: Float){
        tvHasilPsgPjg.text = luas.toString()
    }

    override fun updateKelilingP(keliling: Float){
        tvHasilPsgPjg.text = keliling.toString()
    }

    override fun showError(errorMsg: String) {
        tvHasilPsgPjg.text = errorMsg
        tvHasilPsg.text = errorMsg
    }

    override fun updateLuas(luas: Float){
        tvHasilPsg.text = luas.toString()
    }

    override fun updateKeliling(keliling: Float) {
        tvHasilPsg.text = keliling.toString()
    }
}