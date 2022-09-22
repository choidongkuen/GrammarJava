// 람다식이 함수적 프로그래밍에 쓰이는 예제
// # 참고 
// 익명 객체란 메소드에서 인자로 넘겨 줄 수 있고, 리턴값으로 줄 수 있고, 변수에 저장 가능한 객체를 의미
// 람다식은 익명 객체이다.

package 람다식;
// 함수적 인터페이스 : 추상메소드가 오직 하나인 인터페이스

@FunctionalInterface // 추상 메소드가 2개 이상이면 컴파일 에러 빌생
interface JavaCoding{
    void nowCoding(); // 추상 메소드
}
@FunctionalInterface
interface Sum {
    public int sum(int param01, int param02);
}

public class Lambda02 {

    public static void main(String[] args) {

        JavaCoding jc; // JavaCoding 인터페이스의 객체 생성

        jc = () -> { // 매개변수 x
            System.out.println("Hi I am a Java Coding");
        };
        jc.nowCoding(); // 해당 메소드 호출

        
        
        Sum s; // Sum 인터페이스의 객체 생성
        s = (a,b) -> a + b;

        System.out.println(s.sum(10,11));

    }
}

