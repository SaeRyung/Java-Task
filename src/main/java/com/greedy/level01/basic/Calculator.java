package com.greedy.level01.basic;

import java.util.Scanner;

public class Calculator {
    // 함수 호출용 확인용 메소드
    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    // 1부터 10까지 수를 더하여 값 리턴
    public int sum1to10() {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result += i;
        }
        System.out.println("1부터 10까지의 합: " + result);
        return result;
    }


    // 두 수를 입력받아 큰 수를 출력
    public void checkMaxNumber(int a, int b) {
        System.out.println("두 수중 큰 수는 " + Math.max(a, b) + "이다.");
    }

    // 두 수를 입력받아 합을 리턴함
    public int sumTwoNumber(int a, int b) {
        int result = a + b;
        System.out.println("10과 20의 합은: " + result);
        return result;
    }

    // 두 수를 입력받아 차를 리턴함
    public int minusTwoNumber(int a, int b) {
        int result = a - b;
        System.out.println("10과 5의 차는: " + result);
        return result;
    }
}

