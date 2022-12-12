package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chicken = Herbivores("Chicken", 20.0, "birds")
        val elephant = Herbivores( "Elephant", 10000.0, "mammals")
        val dog = Predator( "Dog", 150.0, "mammals")
        val cat = Predator( "Cat", 30.0, "mammals")

        val list= listOf(chicken,elephant,dog,cat)
        println(list) //Log.d
    }
}