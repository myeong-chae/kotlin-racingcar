package com.kmc

fun main(){
    var loopCount = 0
    var success = false
    while (!success) {
        try {
            val inputList = inputCar()
            Car.createCar(inputList)
            success = true
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
    success = false
    while (!success) {
        try {
            loopCount = inputLoopCount()
            success = true
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }

    for(i in 1..loopCount){
        Car.runStep()
    }

    Car.printWinner()
}

fun inputCar(): List<String> {
    println("자동차 이름을 입력해 주세요(,로 구분)")
    return readLine()?.split(",") ?: throw IllegalArgumentException("[ERROR] 입력을 넣어주세요")
}

fun inputLoopCount(): Int {
    println("시도할 횟수를 알려 주세요")
    return readLine()?.toInt() ?: throw IllegalArgumentException("[ERROR] 숫자로 입력해 주세요")
}