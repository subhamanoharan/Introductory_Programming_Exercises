package com.tw.twu.introductoryProgrammingExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Given a number n, print n lines, each with one more asterisk than the last 
public class TriangleExercise4 {

    public static void main(String args[]) throws Exception {
        int n = getUserInput();
        printAsteriskInRightTriangle(n);
    }

    private static int getUserInput() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n:");
        return Integer.parseInt(br.readLine());
    }

    public static void printAsteriskInRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}