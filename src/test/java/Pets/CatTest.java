package Pets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat petMock = new Cat("Garfield");
    @Test
    void speak() {
        // compare console output to expected text - speak does not return string

        java.io.ByteArrayOutputStream printLog = new java.io.ByteArrayOutputStream();

        System.setOut(new java.io.PrintStream(printLog));

        petMock.speak();

        assertEquals("Meow, my name is Garfield. I am a cat", printLog.toString().trim());
    }
}