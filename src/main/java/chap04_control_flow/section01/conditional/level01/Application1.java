package chap04_control_flow.section01.conditional.level01;

import java.util.Scanner;

    public class Application1{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("정수를 하나 입력하세요: ");
            int num = input.nextInt();
            if(num > 0){
                System.out.println("양수다.");
            }
        }
    }

