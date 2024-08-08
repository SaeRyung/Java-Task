package chap10_exception.com.ohgiraffers.level01.basic;


import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("분자 입력 : ");
            int firstNum = scanner.nextInt();
            System.out.print("분모 입력 : ");
            int secondNum = scanner.nextInt();

            int result = firstNum / secondNum;
            System.out.println("결과 : " + result);
        }catch(InputMismatchException e){
            System.out.println("오류 : 유효한 정수를 입력하세요.");
        }catch(Exception e){
            System.out.println("0으로 나누는 것은 허용되지 않습니다.");
        }finally{
            System.out.println("실행이 완료되었습니다.");
        }
    }
}



