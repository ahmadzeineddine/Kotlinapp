package com.ahmad.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val people = listOf(Person("hiba", 23), Person("Hassan", 25))
        trackBtn.setOnClickListener {
            println("Hello world, I am updated Kotlin now")
            val eldest = people.maxBy { it.age }
            if(eldest!=null) println("The eldest is "+eldest.name)
        }
    }
    data class Person(val name:String, val age:Int=0)
}
