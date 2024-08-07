package chap06_class_and_object.level02.normal.book.run;

import chap06_class_and_object.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bookDTO1 = new BookDTO();
        System.out.println(bookDTO1.getInformation());

        BookDTO bookDTO2 = new BookDTO("자바의 정석", "도우출판", "남궁성", 0, 0.0);
        System.out.println(bookDTO2.getInformation());

        BookDTO bookDTO3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        System.out.println(bookDTO3.getInformation());
    }
}
