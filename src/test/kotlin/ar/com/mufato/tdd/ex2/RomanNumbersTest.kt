package ar.com.mufato.tdd.ex2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RomanNumbersTest{

    @Test
    fun `some test`() {
        val nro = RomanNumbers().getEquivalent(0)
        assertEquals("", nro)
    }
}