package com.tw.twu.introductoryProgrammingExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Given a number n, print a centered triangle.
public class DiamondExercise1 {


    public static void main(String args[]) throws Exception {
        int n = getUserInput();
        printCenteredTriangle(n);
    }

    private static void printCharacter(char pattern, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(pattern);
        }
    }

    private static void printCenteredTriangle(int n) {
        for (int i = n - 1; i >= 0; i--) {
            printCharacter(new Character(' '), i);
            printCharacter(new Character('*'), ((n * 2) - 1)-(2*i));
            System.out.println();

        }
    }

    private static int getUserInput() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n:");
        return Integer.parseInt(br.readLine());
    }


}

