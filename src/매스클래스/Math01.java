package 매스클래스;

public class Math01 {
    public static void main(String[] args) {

        double d1 = 12.426;

        double x1 = 1;
        double y1 = 1;
        double x2 = 2;
        double y2 = 2;

        System.out.println(d1);
        System.out.println(Math.round(d1)); // 반올림 12
        System.out.println(Math.ceil(d1)); // 올림 13
        System.out.println(Math.floor(d1)); // 내림 12

        // 원하는 것은 소수좀 x 자리까지 반올림,반내림 등등
        // Math 로는 한계가 있다. -> SmartMath 를 구현해보자.


        System.out.println("---------------");
        System.out.println(SmartMath.round(d1,2)); // 12.43
        System.out.println(SmartMath.ceil(d1,2)); // 12.43
        System.out.println(SmartMath.floor(d1,2)); // 12.42

        System.out.println("---------------");
        System.out.println(SmartMath.distance(x1,y1,x2,y2)); // 두 점 사이에 거리 구하는 static 메서드
    }
}
