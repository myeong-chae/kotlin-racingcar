package com.kmc

import kotlin.random.Random

class Car(name: String) {
    companion object {
        val mCarList: MutableList<Car> = mutableListOf()
        fun createCar(carList: List<String>){
            carList.forEach {
                mCarList.add(Car(it))
            }
            //사실 아래는 empty일 수는 없음
            if(mCarList.isEmpty()){
                throw IllegalArgumentException("[ERROR] Please insert more then 1 Car name")
            }
        }

        fun runStep(){
            mCarList.forEach {
                canMoveWithMove(it)
            }
        }

        fun canMoveWithMove(car: Car) {
            val number = Random.nextInt(10)
            if(number >= 4){
                car.moveCar()
            }
        }
    }

    var mName = name
        set(value) {
            checkingNameException(value)
            field = value
        }
    var mPosition = 0

    fun checkingNameException(name: String){
        if(name.length > 5){
            throw IllegalArgumentException("[ERROR] Please Set Car Name Length Less than 5 at $name")
        }
        //TODO 공백은?(all space 포함)
    }

    fun printPosition(){
        print("$mName : ")
        var positionDash = ""
        for(i in 1..mPosition){
            positionDash += "-"
        }
        println(positionDash)
    }

    fun moveCar(){
        mPosition++
    }
}