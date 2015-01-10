package com.tw.twu.introductoryProgrammingExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Given a number n, print a centered diamond.
public class DiamondExercise3 {


    public static void main(String args[]) throws Exception {
        String name = "SUBHA";
        int n = getUserInput();
        printCenteredTriangle(n);
        printInverseTriangle(n);
    }

    private static void printInverseTriangle(int n) {
        for (int i = 1; i < n; i++) {
            printCharacter(new Character(' '), i);
            printCharacter(new Character('*'), ((n * 2) - 1) - (2 * i));
            System.out.println();
        }
    }

    private static void printCharacter(char pattern, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(pattern);
        }
    }

    private static void printCenteredTriangle(int n) {
        for (int i = n - 1; i >= 0; i--) {
            printCharacter(new Character(' '), i);
            if (i == 0)
                System.out.print(" SUBHA");
            else
                printCharacter(new Character('*'), ((n * 2) - 1) - (2 * i));
            System.out.println();
        }
    }

    private static int getUserInput() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n:");
        return Integer.parseInt(br.readLine());
    }


}


