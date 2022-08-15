package com.group.libraryapp.calculrator

class Calculator(
        var number: Int
) {

    fun add(operand: Int) {
        this.number += operand
    }

    fun minus(operand: Int) {
        this.number -= operand
    }

    fun muliply(operand: Int) {
        this.number *=operand
    }

    fun divid(operand: Int) {
        if (operand == 0) {
            //코틀린은 new 를 사용하지 않음
            throw IllegalArgumentException("0으로 나눌수 없습니다.")
        }

        this.number /= operand
    }

}
