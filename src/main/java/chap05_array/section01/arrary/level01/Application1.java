package chap05_array.section01.arrary.level01;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        System.out.print(Arrays.toString(arr));
    }
}
