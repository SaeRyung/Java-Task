package chap08_polymorphism.com.ohgiraffers.level01.basic;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }
}
