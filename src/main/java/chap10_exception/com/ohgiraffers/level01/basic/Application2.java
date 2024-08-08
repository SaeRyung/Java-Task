package chap10_exception.com.ohgiraffers.level01.basic;

import java.util.*;


public class Application2 {
    public static void main(String[] args) {
        InvalidAgeException ageException = new InvalidAgeException();

        Scanner input = new Scanner(System.in);
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String HBD = input.nextLine();

        ageException.checkHBD(HBD);

    }

}

