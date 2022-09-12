package 정적;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(10); // 객체 생성
        Circle c2 = new Circle(100); // 객체 생성
        System.out.println("원의 넓이: "+c1.getArea());
        System.out.println("원의 둘레: "+c1.getPerimeter());

        System.out.println("원의 넓이: "+c2.getArea());
        System.out.println("원의 둘레: "+c2.getPerimeter());

        // PI는 변하지 않는 공통되는 값 -> static 으로 선언
    }
}
