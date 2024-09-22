package com.example.adviser

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val findBall = findViewById<Button>(R.id.btn1)
        findBall.setOnClickListener {
            val ball = findViewById<Spinner>(R.id.sp1)
            val ballAct = ball.selectedItem
            val ballList = getBall(ballAct.toString())
            val balls = ballList.reduce{str, item -> str + '\n'+ item}
            val rez = findViewById<TextView>(R.id.txt1)
            rez.text = balls
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun getBall (ball1: String): List<String>{
        return when (ball1) {
            "JavaScript" -> listOf("Топ - 1", "Автор языка: Брендан Эйх, 1995г.", "JS — это мультипарадигменный язык программирования, который поддерживается всеми современными веб-браузерами и предоставляет возможность взаимодействия с пользователем, обработки событий, изменения содержимого и валидации форм, то есть добавляет интерактивности веб-сайтам и веб-приложениям. Благодаря платформе Node.js, разработчики используют JavaScript как на клиентской, так и на серверной стороне, облегчая совместимость и повторное использование кода.")
            "Python" -> listOf("Топ - 2", "Автор языка: Гвидо ван Россум, 1989г.", "Python  — это интерпретируемый язык программирования, который известен своей кросс-платформенностью, что позволяет выполнять программы на разных операционных системах без изменений.")
            "Java" -> listOf("Топ - 3","Автор языка: Джеймс Гослинг, 1995г.",  "Java  — это объектно-ориентированный язык программирования, который известен своей надежностью и переносимостью, что позволяет его использовать на различных платформах и устройствах")
            "Typescript" -> listOf("Топ - 4", "Автор языка: Microsoft, 2012г.", "Typescript  — это строго типизированный язык программирования, расширяющий возможности JavaScript. ")
            "C#" -> listOf("Топ - 5", "Автор языка: Microsoft (под руководством Андерса Хейлсберга и Скотта Вильтаумота), 1998-2001гг.", "C Sharp — это объектно-ориентированный язык программирования, который используется преимущественно для создания приложений под платформу .NET")
            "PHP" -> listOf("Топ - 6", "Автор языка: Расмус Лердорф, 1995г.", "PHP  — это скриптовый язык программирования, который применяется для создания веб-приложений и динамических веб-сайтов. ")
            "C++" -> listOf("Топ - 7", "Автор языка: Бьерн Страуструп, в начале 1980-х годов.", "C++ разработан как расширение языка С")
            "C" -> listOf("Топ - 8", "Автор языка: Bell Labs (создатель языка — Деннис Ритчи), 1969—1973гг.", "Cи — это компилируемый и статически типизированный язык., который полезен для создания системного ПО, операционных систем, встроенных систем и других ресурсоемких приложений, требующих полного контроля над аппаратными ресурсами. Он также является основой для других ЯП, таких как C++ и Objective-C.")
            "Ruby" -> listOf("Топ - 9", "Автор языка: Юкихиро Мацумото, 1995г.", "Ruby является динамическим, интерпретируемым объектно-ориентированным языком программирования, который широко используется в веб-разработке и автоматизации задач.")
            "Golang" -> listOf("Топ -10" , "Mouz: 10%", "GUN5: 55%")
            else -> listOf("Остальные мы ещё не добавили")

        }
    }

}