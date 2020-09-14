package com.main;

import com.main.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(a, b) + " " + calculator.diff(a, b) + " "
         + calculator.multi(a, b) + " " + calculator.div(a, b));*/

        StringParse stringParse = new StringParse();
        stringParse.parseStr();
    }
}
