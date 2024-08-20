package chap08_polymorphism.com.ohgiraffers.level01.basic;

public class Circle extends Shape implements Resizable{
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return radius * Math.PI * 2;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
