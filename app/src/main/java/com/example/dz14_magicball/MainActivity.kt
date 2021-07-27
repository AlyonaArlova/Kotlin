package com.example.dz14_magicball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity", getRandomAnswer())
    }
    private fun getRandomAnswer(): String {
        val answers = arrayOf("Да","Heт","Скорее всего да","Скорее всего нет","Возможно","Имеются перспективы","Вопрос задан неверно")
        return answers.random()
    }
}