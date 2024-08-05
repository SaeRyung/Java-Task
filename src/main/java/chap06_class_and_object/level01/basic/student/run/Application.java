package chap06_class_and_object.level01.basic.student.run;

import chap06_class_and_object.level01.basic.student.model.dto.StudentDTO;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        StudentDTO studentDTO = new StudentDTO();
        String check = "";
        boolean answer = true;
        int count = 0;
        int avg = 0;
        Scanner input = new Scanner(System.in);
        String[][] arr = new String[10][7];


            while(answer){
                System.out.print("학년 : ");
                int grade = input.nextInt();
                arr[count][0] = String.valueOf(grade);

                System.out.print("반 : ");
                int classNum = input.nextInt();
                arr[count][1] = String.valueOf(classNum);

                System.out.print("이름 : ");
                String name = input.next();
                arr[count][2] = String.valueOf(name);

                System.out.print("국어 점수 : ");
                int korean = input.nextInt();
                arr[count][3] = String.valueOf(korean);

                System.out.print("영어 점수 : ");
                int english = input.nextInt();
                arr[count][4] = String.valueOf(english);

                System.out.print("수학 점수 : ");
                int math = input.nextInt();
                arr[count][5] = String.valueOf(math);

                avg = (korean + english + math)/3;
                arr[count][6] = String.valueOf(avg);
                count +=1;

                System.out.print("계속 추가할 겁니까 ? (y/n)");
                check = input.next();

                if(check.equals("n")){
                    answer = false;
                } else if (count>=10) {
                    answer = false;
                }
            }


        System.out.println(Arrays.deepToString(arr));
        }
}

