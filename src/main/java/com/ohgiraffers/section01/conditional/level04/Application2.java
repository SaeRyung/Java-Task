package com.ohgiraffers.section01.conditional.level04;

import javax.swing.*;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        int Bonus = 0;

        int money = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int payment = input.nextInt();
        System.out.print("매출액 입력 : ");
        int sales = input.nextInt();


        if(sales >= 50000000){
            Bonus = 5;
        }else if(sales >= 30000000){
            Bonus = 3;
        }else if(sales >= 10000000){
            Bonus = 1;
        }else{
            Bonus = 0;
        }

        money = (int) (payment + (sales * (Bonus*0.01)));

        System.out.println("======================");
        System.out.println("매출액 : " + sales);
        System.out.println("보너스율 : " + Bonus + "%");
        System.out.println("월 급여 : " + payment);
        System.out.println("보너스 금액 : " + (int)(sales * (Bonus*0.01)));
        System.out.println("======================");
        System.out.println("총 급여 : " + money);

    }


}
