package chap11_io.com.ohgiraffers.level01.basic;

import java.io.*;
import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

//        FileInputStream inputFile = null;

//        try(FileReader inputFile = new FileReader("hello.txt")){
////            char[] arr = new char[100];
//            System.out.println(String.valueOf(inputFile.read()));
//
//
////            for(char c : arr) System.out.print(c);
//        } catch (IOException e) {
//            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
//        }

        FileInputStream fis = null;

        try{
            fis = new FileInputStream("hello.txt");
            byte[] bar = new byte[100];
            fis.read(bar);
            System.out.println(Arrays.toString(bar));
        } catch (IOException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        }

    }
}
