package chap09_api.com.ohgiraffers.level01.basic;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

//        StringBuilder inputStr = new StringBuilder();

        Scanner input = new Scanner(System.in);
        System.out.print("문자열 입력 : ");

        String ss = input.nextLine();
        StringBuilder inputStr = new StringBuilder(ss);
        String[] arr = ss.split(" ");

        int count = arr.length;

        String result = "";
        String firstStr = "";
        String secondStr = "";

        for(int i=0; i<count; i++){
            firstStr = String.valueOf(arr[i].toUpperCase().charAt(0));
            secondStr = arr[i].toLowerCase().substring(1);

            result += firstStr + secondStr + " ";

        }

        result.trim();


        System.out.println("총 단어 개수 : " + count);

        System.out.println("변환된 문자열 : " + result);







    }
}