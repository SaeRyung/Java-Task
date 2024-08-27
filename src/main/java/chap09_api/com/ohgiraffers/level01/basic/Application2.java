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

        StringBuilder BuildStr = new StringBuilder(inputStr.nextLine());

        int strLen = BuildStr.length();
        int idx = BuildStr.indexOf("!");

        String.valueOf(BuildStr.delete(idx,strLen));

        String[] arr = BuildStr.toString().toLowerCase().split(" ");
        int arrLen = arr.length;

        String[] same = new String[arrLen];


        for(int i=0; i<arrLen; i++) {
            int count = 0;
            int len = same.length;
            for(int j=0; j<same.length; j++){

                if(same[j].indexOf(arr[i]) > 0){
                    count++;
                }

                if(same[j].indexOf(arr[i]) < 0){
                    same[j] = arr[i];
                }
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}