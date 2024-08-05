package chap04_control_flow.section02.looping_and_branching.level02;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = input.next();

        int count = str.length();

        for(int i=0; i<count; i++) {
            System.out.println(i + " : " + str.charAt(i));
        }
    }
}
