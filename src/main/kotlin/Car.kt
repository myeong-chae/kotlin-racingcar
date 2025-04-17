package com.kmc

class Car(name: String) {
    companion object {
        val mCarList: MutableList<Car> = mutableListOf()
        fun createCar(carList: List<String>){
            carList.forEach {
                mCarList.add(Car(it))
            }
            if(mCarList.isEmpty()){
                throw IllegalArgumentException("[ERROR] Please insert more then 1 Car name")
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
}