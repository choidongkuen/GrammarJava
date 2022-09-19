// Object 의 equals 메소드가 이미 오버라이딩 되어 있는 대표적인 예시가 바로 String 클래스이다.


package 오브젝트;

public class Object03 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        // 문자열 클래스는 동일한 문자열일 시, 여러개의 참조값을 만들지 않고
        // 하나의 참조 값을 여러 참조 변수가 가리키게 한다.

        System.out.println(s1 == s2); // true

        String s3 = new String("Hello");
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // String 클래스의 equals 메소드는 내용비교를 함으로, true

        // 그러나, 명시적으로 new String(-)으로 문자열 인스턴스를 생성시,
        // 문자열 내용이 동일해도 다른 참조값을 생성
    }
}
