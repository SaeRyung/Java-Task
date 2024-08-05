package chap05_array.section01.arrary.level04;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        int[] arr = new int[4];

        label:
        for(int i=0; i<arr.length; i++) {
            int num = (int)(Math.random() * 9)+0;
            arr[i] = num;
            for(int j=0; j<arr.length; j++) {
                if(arr[j] == num){
                    continue label;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
