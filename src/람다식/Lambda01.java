// 람다식이란 익명함수로 구동되며 Java 8 부터 가능하다.
// 람다식은 함수와 비슷하게 작동하지만, 실행시 익명구현 객체를 생성하는 방식으로 구동된다.
// 람다식은 병럴처리,이벤트 처리 등 함수적 프로그래밍에서 유용하게 쓰인다.

// 람다식의 장점 :
// 1. 코드의 간결성
// 2. 높아지는 가독성
// 3. 병렬처리 가능

// 람다식의 단점 :
// 1. 처음에는 구현하기 까다로움
// 2. 불필요하게 많이 사용시 오히려 가독성 측면에서 안좋아짐
// 3. 디버깅이 어려움

// 형식 : { 매개변수1, ...) -> { 실행문; }

// 특징 :
// 1. 단일 실행문일 때는 중괄호{} 생략 가능
// 2. return 만 있는 경우 중괄호{} 생략 가능

package 람다식;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        list.add("!!!");
        list.add("???");
        list.add("&&&");

        list.forEach(x -> {
            System.out.println(x);
        });

    }
}
