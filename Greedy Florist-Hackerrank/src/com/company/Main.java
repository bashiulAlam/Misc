package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int minimumCost = 0;
        int index = c.length - 1;
        for (int i = 0; i < k; i++) {
            System.out.println("loop 1 : adding element at index : " + index);
            minimumCost += c[index];
            System.out.println("min cost : " + minimumCost);
            index--;
        }

        int itr = 1;
        int flag = 1;
        while (index >= 0 && flag == 1) {
            for (int i = 0; i < k; i++) {
                System.out.println("loop 2 : adding element at index : " + index);
                minimumCost += (c[index] * (itr + 1));
                System.out.println("min cost : " + minimumCost);
                if (index == 0) {
                    flag = 0;
                    break;
                }
                else
                    index--;
            }

            // index -= k;
            itr++;
        }

        return minimumCost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int minimumCost = getMinimumCost(k, c);

        /*bufferedWriter.write(String.valueOf(minimumCost));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        System.out.println(minimumCost);
        scanner.close();
    }
}
