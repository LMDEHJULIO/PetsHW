package Pets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LizardTest {
    Lizard petMock = new Lizard("Slitherin");
    @Test
    void speak() {
        // compare console output to expected text - speak does not return string

        java.io.ByteArrayOutputStream printLog = new java.io.ByteArrayOutputStream();

        System.setOut(new java.io.PrintStream(printLog));

        petMock.speak();



        assertEquals("*Flicks tongue*, my name is Slitherin. I am a lizard.", printLog.toString().trim());
    }
}