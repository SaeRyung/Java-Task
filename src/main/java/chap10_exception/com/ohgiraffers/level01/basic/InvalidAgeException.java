package chap10_exception.com.ohgiraffers.level01.basic;

import java.time.*;


public class InvalidAgeException extends Exception {
    public void checkHBD(String HBD) {

        LocalDate today = LocalDate.now();
        int year = today.getYear();

        int age = Integer.parseInt(HBD.substring(0, 4));
        int mm = Integer.parseInt(HBD.substring(4, 6));
        int dd = Integer.parseInt(HBD.substring(6, 8));

        if(year - age < 20){
            System.out.println("만 20세 이상은 입장 불가입니다.");
        }
        if(year - age > 20){
            System.out.println("입장하셔도 됩니다.");
        }

    }
}
