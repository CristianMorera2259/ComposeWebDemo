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

        interacter.increment()

        assertEquals(2.0, interacter.currentValue, "Incrementar debe sumar 1.0")
    }

    @Test
    fun decrement_decreasesValue() {
        val interacter = Interacter()

        interacter.decrement()

        assertEquals(0.0, interacter.currentValue, "Decrementar debe restar 1.0")
    }
}