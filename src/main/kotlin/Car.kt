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
                it.printPosition()
            }
            println()
        }

        fun canMoveWithMove(car: Car) {
            val number = Random.nextInt(10)
            if(number >= 4){
                car.moveCar()
            }
        }

        fun printWinner() {
            println("우승자 : ${findWinner().joinToString(", ")}")
        }

        fun findWinner(): List<String> {
            val winnerList = mutableListOf<String>()
            sortCarList()
            var winnerPosition = mCarList.first().mPosition
            for(car in mCarList){
                if(winnerPosition == car.mPosition){
                    winnerPosition = car.mPosition
                    winnerList.add(car.mName)
                    continue
                }
                break
            }
            return winnerList
        }

        fun sortCarList(){
            //TODO 재 정렬 시, 입력 순서가 보장 되어야 하나?
            val compare = compareBy<Car> {it.mPosition}
            mCarList.sortWith(compare)
            mCarList.reverse()
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