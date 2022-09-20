// Collection 인터페이스를 구현하는 모든 클래스의 인스턴스는 Iterator 메소드를 가진다.(반복자)
// 이는 Iterator 인터페이스를 구현하는 어떠한 클래스의 인스턴스의 참조값을 반환하는 메소드이다.
// 그렇다면 어떤 클래스인가? -> 중요하지 않다. 중요한 것은 Iterator 인터페이스를 구현하기에, Iterator 인터페이스에 정의된 메소드를 구현했을 것이라는 점이다.
// 최상위 인터페이스인 Iterable 은 오로지 iterator 메소드 만을 가진다.
// Iterator 는 저장 방식과 상관 없이 데이터 전체를 참조하기 위한 방식이다.

// 메소드 :
// boolean hasNext() : 다음 요소가 존재하면 true
// E next() : 다음 번 객체를 반환
// void remove() : 현재 위치의 요소를 삭제

package 컬렉션.리스트;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i <= 5; i++) {
            linkedList.add(i);
        } // 0 1 2 3 4 5

        Iterator<Integer> itr = linkedList.iterator();
        // Iterator 인터페이스를 구현한 임의의 클래스의 인스턴스 참조값이 반환

//        System.out.println(itr.next());


        while(itr.hasNext()) {

            Integer element = itr.next();
            System.out.print(element+" "); // 출력

            if (element == 3) {
                itr.remove(); // next 메소드로 반환된 데이터를 삭제
            }
        }
        System.out.println("\n=========");

        itr = linkedList.iterator(); // 다시 itr 를 정의해야 함.
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
