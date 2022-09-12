package 정적;

public class Circle {

    double radius; // 반지름
    static double PI = 3.141592; // 파이
    public Circle(double r){
        this.radius = r;
    }

    public double getArea(){
        return radius * radius * PI;
    }

    public double getPerimeter(){
        return 2 * PI * radius;
    }
}
