package com.greedy.level01.basic.student.model.dto;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int mate;
    private int avg;

    public StudentDTO() {};


    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int mate) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mate = mate;
    }




    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getClassroom() {
        return classroom;
    }
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public int getMate() {
        return mate;
    }
    public void setMate(int mate) {
        this.mate = mate;
    }


    public String getInformation() {
        System.out.println("학년=" + this.grade + ", 반=" + this.classroom + ", 이름=" + this.name + ", 국어=" + this.kor + ", 영어=" + this.eng + ", 수학=" + this.mate);
        return "";
    }
}

