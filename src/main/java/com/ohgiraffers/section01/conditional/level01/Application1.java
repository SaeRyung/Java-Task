package com.ohgiraffers.section01.conditional.level01;

import java.util.Scanner;

    public class Application1{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            if(num > 0){
                System.out.println("양수다.");
            }
        }
    }

