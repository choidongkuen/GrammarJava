// Set 인터페이스를 구현하는 컬렉션 클래스는 순서가 없기 때문에, get으로 접근 불가!
// 데이터 전체를 참조하는 반복자를 사용해야 한다.

package 컬렉션.리스트;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorUsage {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>(); // HashSet 생성

        for (int i = 0; i <= 5; i++)
            hashSet.add(i);

        Iterator<Integer> itr = hashSet.iterator(); // Iterator 인터페이스를 구현하는 클래스의 인스턴스 반환

        while(itr.hasNext())
            System.out.println("itr.next() = " + itr.next());
    }
}
