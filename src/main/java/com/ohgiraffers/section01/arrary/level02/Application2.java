package com.ohgiraffers.section01.arrary.level02;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("주민등록번호를 입력하세요 : ");
        String[] str = input.nextLine().split("");

        for(int i = 0; i < str.length; i++){
            if(i > 7){
                str[i] = "*";
            }
        }

        String result = String.join("", str);
        System.out.println(result);
    }
}
