package Pets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {
    Fish petMock = new Fish("Luffy");
    @Test
    void speak() {
        java.io.ByteArrayOutputStream printLog = new java.io.ByteArrayOutputStream();

        System.setOut(new java.io.PrintStream(printLog));

        petMock.speak();



        assertEquals("Bloop-bloop, my name is Luffy. I am a fish.", printLog.toString().trim());
    }
}