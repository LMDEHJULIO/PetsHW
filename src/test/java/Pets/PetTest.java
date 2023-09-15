package Pets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    Lizard petMock = new Lizard("Slizzy");

    @Test
    void getName() {
        assertEquals("Slizzy", petMock.getName());
    }

    @Test
    void setName() {
        petMock.setName("Charzard");
        assertEquals("Charzard", petMock.getName());
    }
//
//    @Test
//    void speak() {
//    }
}