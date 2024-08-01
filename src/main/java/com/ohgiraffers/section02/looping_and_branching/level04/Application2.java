package com.ohgiraffers.section02.looping_and_branching.level04;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("받으신 금액을 입력하세요 : ");
        int money = in.nextInt();
        System.out.print("상품 가격을 입력하세요 : ");
        int price = in.nextInt();

        int Change = money - price;
        int Omanwon = 0;
        int manwon = 0;
        int Ochonwon = 0;
        int chonwon = 0;
        int Obackwon = 0;
        int backwon = 0;
        int Oshipwon = 0;
        int shipwon = 0;



        int rest = 0;

        // 5만원
        if (Change % 50000 != 0) {
            Omanwon = Change / 50000;
            rest = Change % 50000;
        }else {
            Omanwon = Change / 50000;
        }

        // 만원
        if (rest % 10000 != 0) {
            manwon = rest / 10000;
            rest = rest % 10000;
        }else{
            manwon = rest / 10000;
        }

        // 5천원
        if(rest % 5000 != 0){
            Ochonwon = rest / 5000;
            rest = rest % 5000;
        }else{
            Ochonwon = rest / 5000;
        }

        //천원
        if(rest % 1000 != 0){
            chonwon = rest / 1000;
            rest = rest % 1000;
        }else{
            chonwon = rest / 1000;
        }

        //오백원
        if(rest % 500 != 0){
            Obackwon = rest / 500;
            rest = rest % 500;
        }else{
            Obackwon = rest / 500;
        }

        // 백원
        if(rest % 100 != 0){
            backwon = rest /100;
            rest = rest % 100;
        }else{
            backwon = rest / 100;
        }


        //오십원
        if(rest % 50 != 0){
            Oshipwon = rest / 50;
            shipwon = rest % 50;
        }else {
            Oshipwon = rest / 50;
        }
        shipwon /= 10;



        System.out.println("50000원권 지폐 " + Omanwon + "장");
        System.out.println("10000원권 지폐 " + manwon + "장");
        System.out.println("5000원권 지폐 " + Ochonwon + "장");
        System.out.println("1000원권 지폐 " + chonwon + "장");
        System.out.println("500원권 동전 " + Obackwon + "개");
        System.out.println("100원권 동전 " + backwon + "개");
        System.out.println("50원권 동전 " + Oshipwon + "개");
        System.out.println("10원권 동전 " + shipwon + "개");
    }


}
