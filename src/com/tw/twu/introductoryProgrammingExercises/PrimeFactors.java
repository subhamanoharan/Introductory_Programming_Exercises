package com.tw.twu.introductoryProgrammingExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Represent a class that return prime factors
public class PrimeFactors {
    private static int getUserInput() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n:");
        return Integer.parseInt(br.readLine());
    }
    public static List<Integer> generate(int n)
    {
        List<Integer> result=new ArrayList<Integer>();
        for(int i=2;i<(n);i++)
        {
            if(n%i==0 && isPrime(n))
                result.add(i);
        }
        return result;
    }

    private static boolean isPrime(int i) {
        for(int j=2;j<i;j++)
            if (i%j == 0)
                return false;
        return true;
    }


    public static void main(String args[])throws Exception{
        int n = getUserInput();
        System.out.println("The result is:");
        printList(generate(n));
    }

    private static void printList(List<Integer> result) {
        for (int s : result)
            System.out.print(" "+s);
    }
}
