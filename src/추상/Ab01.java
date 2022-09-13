package 추상;

import java.io.Reader;

public class Ab01 {
    public static void main(String[] args) {
        Triangle te = new Triangle(10,10,100,120);
        te.draw(); // 삼각형

        Rectangle re = new Rectangle(15,12,200,240);
        re.draw(); // 사각형

        Circle c = new Circle(2,2,10);
        c.draw(); // 원
    }
}
