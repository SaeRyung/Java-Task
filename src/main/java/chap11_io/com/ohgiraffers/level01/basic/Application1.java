package chap11_io.com.ohgiraffers.level01.basic;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

//        FileInputStream inputFile = null;

        try(FileReader inputFile = new FileReader("hello.txt")){
            char[] arr = new char[100];
            inputFile.read();

            for(char c : arr) System.out.print(c);
        } catch (IOException e) {
            System.out.println("해당 이름을 가진 파일이 없습니다.");
        }

    }
}
