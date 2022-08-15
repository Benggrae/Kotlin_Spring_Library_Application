package com.group.libraryapp.calculrator


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


class CalculatorTest {

    @Test
    fun addTest() {
        //given
        val calculrator = Calculator(5)

        //when
        calculrator.add(3)

        //then
        assertThat(calculrator.number).isEqualTo(8)
    }

    @Test
    fun minusTest() {
        //given
        val calculrator = Calculator(5)

        //when
        calculrator.minus(3)

        //then
        assertThat(calculrator.number).isEqualTo(2)
    }

    @Test
    fun multflyTest() {
        //given
        val calculrator = Calculator(5)

        //when
        calculrator.muliply(3)

        //then
        assertThat(calculrator.number).isEqualTo(15)

    }

    @Test
    fun dividTest() {
        //given
        val calculrator = Calculator(5)

        //when
        calculrator.divid(3)

        //then
        assertThat(calculrator.number).isEqualTo(1)
    }

    @Test
    fun dividExceptionTest() {
        //given
        val calculrator = Calculator(5)

        //when & then
        assertThrows<IllegalArgumentException> {
            calculrator.divid(0)
        }.apply {
            assertThat(message).isEqualTo("0으로 나눌수 없습니다.")
        }
    }
}
