package chap05_array.section01.arrary.level02;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String[] str = sc.nextLine().split("");

        System.out.print("검색할 문자를 입력하세요 : ");
//        char[] carr = sc.next().toCharArray();
        String carr = sc.next();

        int count = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(carr)) {
                count++;
            }
        }

        String s = String.join("", str);

        System.out.println("입력하신 문자열 " + s + "에서 찾으시는 문자 " + carr + "은 " + count + "개 입니다.");
    }
}
