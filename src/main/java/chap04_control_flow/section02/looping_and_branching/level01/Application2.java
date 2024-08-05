package chap04_control_flow.section02.looping_and_branching.level01;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++){
            sum+=i;
        }
        System.out.println("1부터 " + num + "까지의 합 : " + sum);
    }
}
