// TreeMap 은 TreeSet 처럼 정렬기준대로 정렬하면서 데이터를 저장한다.
// 정렬에 대상은 'key' 이다.

package 컬렉션.맵;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class Map03 {
    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(1,"최동근");
        treeMap.put(2,"김수진");
        treeMap.put(3,"박진우");
        treeMap.put(4,"원진아");
        treeMap.put(5,"박수진");

        NavigableSet<Integer> navi = treeMap.navigableKeySet();
        // NavigableSet 인터페이스를 구현하는 클래스 인스턴스의 참조값이 반환
        // 인스턴스에는 저장된 데이터들의 key 정보가 있다.(일종의 set)

        System.out.println("오름차순 출력...");
        Iterator<Integer> itr = navi.iterator();

        while(itr.hasNext())
            System.out.println("treeMap.get(itr.next()) = " + treeMap.get(itr.next()));

        System.out.println("================================");
        System.out.println("내림차순 출력...");
        itr = navi.descendingIterator();

        while(itr.hasNext())
            System.out.println("treeMap.get(itr.next()) = " + treeMap.get(itr.next()));
    }
}
