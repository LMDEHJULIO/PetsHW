package Pets;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PetSurveyTest {



    @Test
    void displayOptions() {
        String[] options = {"1. Dog", "2. Cat", "3. Rodent"};

        // Create ByeArrrayOutputStream to store print that won't actually go to the console
        ByteArrayOutputStream consoleLog = new ByteArrayOutputStream();

//        PrintStream actualOut = System.out;

        // Capture console out/direct the SOut to the consoleLog ByteStream
        System.setOut(new PrintStream(consoleLog));


        PetSurvey.displayOptions(options);


        for(String option : options){
            // Convert ByteArray to String - check that it contains the option string
            assertTrue(consoleLog.toString().contains(option));
        }

    }

    @Test
    void startSurvey() {
    }
}