package com.praktikum.mvpsimple

class MainPresenter(private val mainView: MainActivity){
    //Persegi Panjang
    fun hitungLuasPersegiPjg(panjang: Float, lebar: Float){
        if (panjang == 0F){
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F){
            mainView.showError("Lebar tidak boleh 0")
            return
        }

        val luas = panjang*lebar
        mainView.updateLuasP(luas)
    }
    fun hitungKelilingPersegiPjg(panjang: Float,lebar: Float){
        if (panjang == 0F){
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F){
            mainView.showError("Lebar tidak boleh 0")
            return
        }
        val keliling = 2*(panjang+lebar)
        mainView.updateKelilingP(keliling)
    }

    //Persegi
    fun hitungLuasPersegi(panjang: Float){
        if (panjang == 0F){
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        val luas = panjang*panjang
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegi(panjang: Float){
        if (panjang == 0F){
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        val keliling = panjang*4
        mainView.updateKeliling(keliling)
    }
}