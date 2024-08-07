package chap05_array.section01.arrary.level03;

import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
         * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
         *
         * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
         */
        Scanner input = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int num = input.nextInt();

        int[] arr = new int[num];

        if(num % 2 == 0){
            System.out.print("양수 혹은 홀수만 입력해야 합니다.");
        } else{
            int point = num/2;

            for (int i = 0; i < num; i++) {
                if(i == point) {
                    arr[i] = point+1;
                } else if (i > point) {
                    arr[i] = point;
                    point = point-1;
                }else{
                    arr[i] = i+1;
                }
            }
            System.out.print(Arrays.toString(arr));
        }

    }
}
