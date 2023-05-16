package ar.com.mufato.tdd.ex1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzerTest{

    private val fizzBuzzer = FizzBuzzer()

    @Test
    fun `fizz buzz test`() {
        val something = fizzBuzzer.doSomething(0)
        assertEquals("",something)
    }

}