package com.example.dz14_magicball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.text.toList

class MainActivity : AppCompatActivity() {
    private val word1 = "папа"
    private val word2 = "папа"
    var result1 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity", getRandomAnswer())
        Log.e("MainActivity", sumOfWords(word1, word2))

    }

    private fun getRandomAnswer(): String {
        val answers = arrayOf(
            "Да",
            "Heт",
            "Скорее всего да",
            "Скорее всего нет",
            "Возможно",
            "Имеются перспективы",
            "Вопрос задан неверно"
        )
        return answers.random()
    }

    val alphabet = mapOf<Char, Int>(
        'а' to 1,
        'б' to 2,
        'в' to 3,
        'г' to 4,
        'д' to 5,
        'е' to 6,
        'ё' to 7,
        'ж' to 8,
        'з' to 9,
        'и' to 10,
        'й' to 11,
        'к' to 12,
        'л' to 13,
        'м' to 14,
        'н' to 15,
        'о' to 16,
        'п' to 17,
        'р' to 18,
        'с' to 19,
        'т' to 20,
        'у' to 21,
        'ф' to 22,
        'х' to 23,
        'ц' to 24,
        'ч' to 25,
        'ш' to 26,
        'щ' to 27,
        'ъ' to 28,
        'ы' to 29,
        'ь' to 30,
        'э' to 31,
        'ю' to 32,
        'я' to 33
    )

    fun sumOfWords(word1: String, word2: String): String {
        var allWords = word1.toString() + word2.toString()
        val chars: List<Char> = allWords.toLowerCase().toList()
        var allSumResult=0
        for (char in chars) {
            allSumResult += alphabet[char]!!
        }
        return allSumResult.toString()

    }
}


/*1) метод - getRandomAnswer - вывод на консоль
Разработать программу, которая будет как "магически" шар выдавать случайный результат.
К примеру, вы ей задаете вопрос: "..... . .. ... .. ?", а она выдает вам результат из предложенного:
Да
Нет
Скорее всего да
Скорее всего нет
Возможно
Имеются перспективы
Вопрос задан неверно*/
/*
2)вывод в консоль - В русском языке 33 буквы, ваша задача сделать программу которая сможет производить операции со словами
(переводить каждый символ в цифру, складывать её с остальными цифрами и в результате получать число) - в последствии
производить операции над этим числом.
Пример:
Саша + Маша = 89

(19 + 1 + 26 + 1) + (14 + 1 + 26 + 1) = 47 + 42

С - 19
А - 1
Ш - 26
М - 14*/