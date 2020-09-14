package com.euler;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int q = scanner.nextInt();

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        BigInteger n = scanner.nextBigInteger();

        BigInteger fn1 = BigInteger.valueOf(s1.length());
        BigInteger fn2 = BigInteger.valueOf(s2.length());
        BigInteger fn = fn1.add(fn2);

        while (fn.compareTo(n) < 0) {
            fn1 = fn2;
            fn2 = fn;
            fn = fn1.add(fn2);
            System.out.println("fn1 : " + fn1 + " fn2 : " + fn2 + " fn : " + fn);
        }

        BigInteger sum = BigInteger.valueOf(s1.length() + s2.length());
        BigInteger diff = fn.subtract(n);
        System.out.println("diff : " + diff + " sum : " + sum);
        /*while (diff.compareTo(sum) > 0) {
            diff = diff.subtract(sum);
            System.out.println("diff : " + diff + " sum : " + sum);
        }*/

        int i  = diff.intValue();
        String strCat = s1 + s2;
        BigInteger bigMod = diff.mod(BigInteger.valueOf(strCat.length()));
        System.out.println("mod with big int :" + bigMod.intValue());
        System.out.println("char at big int mod : " + strCat.charAt(strCat.length() + 1 - bigMod.intValue()));
        System.out.println("I : " + i + " strCat : " + strCat);
        int mod = i % strCat.length();
        System.out.println(mod);
        System.out.println(strCat.charAt(strCat.length() - 1 - mod));
    }
}
