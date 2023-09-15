package Pets;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PetSurveyTest {



    @Test
    void displayOptions() {
        String[] options = {"1. Dog", "2. Cat", "3. Rodent"};

        ByteArrayOutputStream consoleLog = new ByteArrayOutputStream();
        PrintStream actualOut = System.out;

        System.setOut(new PrintStream(consoleLog));

        PetSurvey.displayOptions(options);


        for(String option : options){
            assertTrue(consoleLog.toString().contains(option));
        }

    }

    @Test
    void startSurvey() {
    }
}