package chap04_control_flow.section01.conditional.level02;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("체중을 입력하세요: ");
        int kg = scanner.nextInt();
        System.out.print("키를 입력하세요: ");
        int tall = scanner.nextInt();

        float BMI = kg / (tall * tall);

        if(BMI<20){
            System.out.println("당신은 저체중 입니다.");
        } else if (20 <= BMI && BMI< 25) {
            System.out.println("당신은 정상 체중 입니다.");
        } else if(25 <= BMI && BMI < 30){
            System.out.println("당신은 과체중 입니다.");
        } else {
            System.out.println("당신은 비만 입니다.");
        }

    }
    }

