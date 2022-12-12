package com.example.myapplication

open class Animals(
   protected val name: String,
    val size: Double,
    val kind: String
) {
    open fun printName(){
        println("this plant have name $name and size $size")
    }
}