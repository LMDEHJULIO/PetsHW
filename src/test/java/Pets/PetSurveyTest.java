package Pets;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class PetSurveyTest {

    ByteArrayOutputStream consoleLog = new ByteArrayOutputStream();
    @Test
    void displayOptions() {
        String[] options = {"1. Dog", "2. Cat", "3. Rodent"};

        PetSurvey.displayOptions(options);

        for(String option : options){
            assertTrue(consoleLog.toString().contains(option));
        }

    }

    @Test
    void startSurvey() {
    }
}