package chap08_polymorphism.com.ohgiraffers.level01.basic;

public class Triangle extends Shape implements Resizable{

    private double base; // 밑변
    private double height; // 높이
    private double side1; // 첫번째 변
    private double side2; // 두번째 변
    private double side3; // 세번째 변


    // 추상메소드 오버라이딩 시 매개변수값 없이 똑같아야 한다.
    // 생성자 만들어야 필드 사용 가능
    public Triangle(int base, int height, int side1, int side2, int side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    @Override
    double calculateArea() {
        return (base * height)/2 ;
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void resize(double factor) {
        base *= factor;
        height *= factor;
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}
