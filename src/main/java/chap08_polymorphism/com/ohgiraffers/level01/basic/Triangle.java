package chap08_polymorphism.com.ohgiraffers.level01.basic;

public class Triangle {
    public Triangle(){}
    // 삼각형 둘레
    public int trianglePerimeter(int a, int b, int c, int d, int e){
        return c + d+ e;
    }
    // 삼각형 넓이
    public int triangleArea(int a, int b, int c, int d, int e){
        return (a * b)/2;
    }
}
