package com.example.myapplication

class Predator(
    name: String,
    size: Double,
    kind: String)
    :Animals(name,size,kind) {
    fun printPlant(){
        println("this herbivores have name $name and size $size")
    }
}