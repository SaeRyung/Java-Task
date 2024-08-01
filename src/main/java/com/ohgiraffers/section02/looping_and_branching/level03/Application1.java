package com.ohgiraffers.section02.looping_and_branching.level03;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
        int num = input.nextInt();

        if (num < 2) {
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
        }

        }
    }

