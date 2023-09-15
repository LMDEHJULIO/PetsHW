package Pets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog petMock = new Dog("Scruffy");
    @Test
    void speak() {
        // compare console output to expected text - speak does not return string

        java.io.ByteArrayOutputStream printLog = new java.io.ByteArrayOutputStream();

        System.setOut(new java.io.PrintStream(printLog));

        petMock.speak();



        assertEquals("Woof, my name is Scruffy. I am a dog.", printLog.toString().trim());
    }
}