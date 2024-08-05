package chap04_control_flow.section01.conditional.level04;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int korean = scanner.nextInt();

        System.out.print("영어 점수를 입력하세요 : ");
        int English = scanner.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        int Mathh = scanner.nextInt();

        float sum = (korean + English + Mathh);
        float Avg = (korean + English + Mathh) / 3;

        if(Avg >= 60 && sum >= 120){
            System.out.println("합격입니다!");
        }else {
            System.out.println("평균점수 미달로 불합격입니다.");
        }


        if(Avg < 60){
            if(korean < 40){
                System.out.println("국어 점수 미달로 불합격입니다.");
            } else if (English < 40) {
                System.out.println("영어 점수 미달로 불합격입니다.");
            } else{
                System.out.println("수학 점수 미달로 불합격입니다.");
            }
        }

    }
}

