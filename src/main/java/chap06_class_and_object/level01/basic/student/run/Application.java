package chap06_class_and_object.level01.basic.student.run;

import chap06_class_and_object.level01.basic.student.model.dto.StudentDTO;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StudentDTO[] studentDTO = new StudentDTO[10];

        int count = 0;
        do {
            System.out.print("학년 : ");
            int grade = input.nextInt();

            System.out.print("반 : ");
            int classNum = input.nextInt();

            System.out.print("이름 : ");
            String name = input.next();

            System.out.print("국어 점수 : ");
            int korean = input.nextInt();

            System.out.print("영어 점수 : ");
            int english = input.nextInt();

            System.out.print("수학 점수 : ");
            int math = input.nextInt();

//            count+=1;
            studentDTO[count++] = new StudentDTO(grade, classNum, name, korean, english, math);

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");


        }while(input.next().charAt(0) == 'y');

        for(int i=0; i<studentDTO.length; i++){
            if(studentDTO[i] == null) break;
            else {
                System.out.println(studentDTO[i].getInformation());
            }
        }
    }
}

