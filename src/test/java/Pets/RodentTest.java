package Pets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodentTest {

    Rodent petMock = new Rodent("Pip");
    @Test
    void speak() {
        // compare console output to expected text - speak does not return string

        java.io.ByteArrayOutputStream printLog = new java.io.ByteArrayOutputStream();

        System.setOut(new java.io.PrintStream(printLog));

        petMock.speak();



        assertEquals("*Squeak*, my name is Pip. I am a rodent", printLog.toString().trim());
    }
}