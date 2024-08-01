package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        System.out.print("첫 번째 정수 : ");
        int firstNum = input.nextInt();
        System.out.print("두 번째 정수 : ");
        int secondNum = input.nextInt();

        System.out.print("연산 기호를 입력하세요 : ");
        String col = input.next();

        switch (col) {
            case "+": result = firstNum + secondNum; break;
            case "-": result = firstNum - secondNum; break;
            case "*": result = firstNum * secondNum; break;
            case "/": result = firstNum / secondNum; break;
            case "%": result = firstNum % secondNum; break;
        }

        System.out.println(firstNum + col + secondNum + "=" + result) ;
    }
}
