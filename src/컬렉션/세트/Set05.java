// TreeMap 구현해보자.

package 컬렉션.세트;

import java.util.Iterator;
import java.util.TreeSet;

public class Set05 {

    public static void main(String[] args) {

        TreeSet<Integer>treeSet = new TreeSet<>(); // 역시 제네릭 클래스이다.

        treeSet.add(1);
        treeSet.add(20);
        treeSet.add(3);
        treeSet.add(40);
        treeSet.add(5);

        // 들어오는 값을 오름 차순으로 정렬
        System.out.println("treeSet.size() = " + treeSet.size());

        Iterator<Integer> itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.println("itr.next() = " + itr.next());
        }
    }
}
