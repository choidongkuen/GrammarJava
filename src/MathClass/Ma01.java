// Math 클래스의 모든 변수 및 메소드는 static 으로 구성되어 있으며, 인스턴스를 만들 목적으로 설계된 클래스가 아니다.
// 이름이 직관적이여서 사용하기 편하다
// java.lang 패키지에 존재

package MathClass;

public class Ma01 {
    public static void main(String[] args) {
        System.out.println("PI : " + Math.PI); // 원주율
        System.out.println("2의 제곱근 : " + Math.sqrt(2)); // 2의 제곱근

        System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI));
        System.out.println("2파이에 대한 Degree : " + Math.toDegrees(2.0 * Math.PI)); // 각도

        double radian = Math.toRadians(45);
        System.out.println("싸인 45 : " + Math.sin(radian));
        System.out.println("코싸인 45 : " + Math.cos(radian));
        System.out.println("탄젠트 45 : " + Math.tan(radian)); // 라디안 ex) 4분의 파이 -> 45 도

        System.out.println("로그 25 " + Math.log(25));
        System.out.println("2의 4승 : " + Math.pow(2,4));
    }
}
