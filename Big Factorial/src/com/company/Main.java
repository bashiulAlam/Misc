package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        if (n == 1)
            System.out.println(1);
        else {
            List<Integer> digit = new ArrayList<Integer>();
            digit.add(1);
            int carry = 0;
            int multiplyResult = 0;
            int mod = 0;
            int i = 2;
            //int j = 0;
            while (i <= n) {
                //System.out.println("index : " + j + " i : " + i);
                int len = digit.size();
                for (int j = 0; j < len; j ++) {
                    multiplyResult = i * digit.get(j);
                    //System.out.println("multi: " + multiplyResult);
                    mod = multiplyResult % 10;
                    digit.set(j, carry + mod);
                    carry = multiplyResult / 10;
                    System.out.println(digit.get(j));

                    if (carry > 0 && j == len - 1) {
                        digit.add(carry);
                        System.out.println("carry added : " + carry);
                        carry = 0;
                    }
                }

                //System.out.println("list size : " + digit.size());
                i++;
            }

            for (int k = digit.size() - 1; k >= 0; k--)
                System.out.print(digit.get(k));
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}

