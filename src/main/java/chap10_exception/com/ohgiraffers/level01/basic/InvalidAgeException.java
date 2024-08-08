package chap10_exception.com.ohgiraffers.level01.basic;


public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        System.out.println("날짜 양식을 잘못 입력하셨습니다.");
    }
}
