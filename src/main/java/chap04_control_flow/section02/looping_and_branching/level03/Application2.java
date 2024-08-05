package chap04_control_flow.section02.looping_and_branching.level03;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {

        int count = 1;

        int random1 = (int)(Math.random() * 100) + 1;

        Scanner input = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = input.nextInt();


        label:


        for(int i = 1; i <= num; i++) {

            if(random1 == num) {
                System.out.println("정답입니다. " + count + "만에 정답을 맞추셨습니다.");
                break;
            } else if (random1 > num) {
                count++;
                System.out.println("입력하신 정수보다 큽니다.");
                continue label;
            } else{
                count++;
                System.out.println("입력하신 정수보다 작습니다.");
                continue label;
            }
        }
    }
}
