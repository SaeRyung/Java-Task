package chap10_exception.com.ohgiraffers.level01.basic;

import java.time.LocalDate;
import java.util.*;


public class Application2 {
    public static void main(String[] args) {
//        InvalidAgeException ageException = new InvalidAgeException();

        Scanner input = new Scanner(System.in);
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String HBD = input.nextLine();



        try{
            InputBirthDay(HBD);
        }catch(InvalidAgeException e){
            e.printStackTrace();
        }
    }

    public static void InputBirthDay(String HBD){
        LocalDate today = LocalDate.now();
        int year = today.getYear();

        int age = Integer.parseInt(HBD.substring(0, 4));
        int mm = Integer.parseInt(HBD.substring(5, 7));
        int dd = Integer.parseInt(HBD.substring(8));

        if(year - age < 20){
            System.out.println("만 20세 이상은 입장 불가입니다.");
        }
        if(year - age > 20){
            System.out.println("입장하셔도 됩니다.");
        }if(mm>12 || mm<1){
            throw new InvalidAgeException();
        }if(dd>31 || dd<1){
            throw new InvalidAgeException();
        }

    }

}

