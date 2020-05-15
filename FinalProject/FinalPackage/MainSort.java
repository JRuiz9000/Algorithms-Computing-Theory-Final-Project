package FinalPackage;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainSort {
    public static void main(String[] args) {

        // while loop (boolean logic) to allow an opportunity to reurun program
        boolean play = true;
        while (play == true) {

            // Print start/exit program + scanner to take in response
            System.out.println("Enter 1 to start the program, or enter -1 to exit.");
            Scanner scn1 = new Scanner(System.in);

            // call to merge sort && run time calculator algorithm

            // Scanner to exit or rerun program
            System.out.println("Would you like to rerun?  Enter 1 to re-run.  Press any other key to exit.");
            Scanner scn2 = new Scanner(System.in);

            // if statement to determine rerun or exit
            if (scn2 == 1) {
                play = true;
            } else {
                play = false;
            }
        }
    }
}