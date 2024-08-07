package chap09_api.com.ohgiraffers.level01.basic;

import java.util.*;

public class Application2 {

    public static void main(String[] args) {

        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */

        Scanner inputStr = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = inputStr.nextLine();

        StringBuilder BuildStr = new StringBuilder(str);
        int strLen = BuildStr.length();
        int idx = str.indexOf("!");

        String.valueOf(BuildStr.delete(idx,strLen));

        String[] arr = BuildStr.toString().split(" ");
        int arrLen = arr.length;
        int resultCount = 0;

        
        StringBuilder result = new StringBuilder();

        for(int i=0; i<arrLen; i++){
            int count = 0;
            String word = arr[i].toLowerCase();

            for(int j=0; j<arrLen; j++){
                if(word.equals(arr[j].toLowerCase())){
                    count+=1;
                }

            }
            System.out.println(arr[i] + ": " + count);
        }
        System.out.println(resultCount);


    }
}