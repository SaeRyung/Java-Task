package com.greedy.level01.basic;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner input =  new Scanner(System.in);

        cal.checkMethod();
        cal.sum1to10();
        cal.checkMethod();
        cal.sumTwoNumber(10, 20);
        cal.minusTwoNumber(10, 5);

    }
}
