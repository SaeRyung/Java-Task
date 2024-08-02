package com.ohgiraffers.section01.arrary.level04;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Application1 {
    public static void main(String[] args) {
        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         * */
        int[] arr = new int[6];

        label:
        for(int i=0; i<arr.length; i++){
            int num = (int) (Math.random() * 45) + 1;
            arr[i] = num;
//            label:
            for(int j=0; j<arr.length; j++){
                if(arr[j] == num){
                    continue label;
                }
            }
        }
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
