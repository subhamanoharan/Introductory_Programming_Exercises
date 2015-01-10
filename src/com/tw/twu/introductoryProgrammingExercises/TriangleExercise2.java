package com.tw.twu.introductoryProgrammingExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Given a number n, print n asterisks on one line.
public class TriangleExercise2 {

    public static void main(String args[]) throws Exception {
        int n = getUserInput();
        printAsteriskInALine(n);
    }

    private static int getUserInput() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n:");
        return Integer.parseInt(br.readLine());
    }

    public static void printAsteriskInALine(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("*");
    }

}
