package net.cristian2259.webdemo

import kotlin.test.Test
import kotlin.test.assertEquals

class InteracterTest {

    @Test
    fun checkInitialValue() {
        val interacter = Interacter()
        assertEquals(100.0, interacter.currentValue, "El valor inicial debe ser 100.0")
    }

    @Test
    fun increment_increasesValue() {
        val interacter = Interacter()

        val initValue = interacter.currentValue
        interacter.increment()
        val expectedValue: Double = initValue + 1.0

        assertEquals(
            expectedValue,
            interacter.currentValue,
            "Incrementar -> El valor inicial $initValue se esperaba que fuera $expectedValue pero resultó ser ${interacter.currentValue}"
        )
    }

    @Test
    fun decrement_decreasesValue() {
        val interacter = Interacter()

        val initValue = interacter.currentValue
        interacter.decrement()
        val expectedValue: Double = initValue - 1.0

        assertEquals(
            expectedValue,
            interacter.currentValue,
            "Decrementar -> El valor inicial $initValue se esperaba que fuera $expectedValue pero resultó ser ${interacter.currentValue}"
        )
    }
}