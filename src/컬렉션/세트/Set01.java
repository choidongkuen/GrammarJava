// Set 인터페이스를 구현하는 컬렉션 클래스의 특징
// 1. 저장 순서 유지 x
// 2. 중복 허용 x

// 메소드 :
// add(Object obj) # 인스턴스 추가
// addAll(Collection c) # 컬렉션에 있는 모든 인스턴스 추가
// remove(Object obj) # 인스턴스 삭제
// removeAll(Collection c) # 컬렉션에서 동일한 것들을 모두 삭제(차집합)
// isEmpty() # 컬렉션 비어있는지 확인
// clear() # 모든 데이터 삭제
// size() # 크기 반환
// contains(Object obj) # 인스턴스 존재 여부 확인
// containsAll(Collection c) # 주어진 컬렉션에 저장된 모든 객체들을 포함하고 있는지 확인
// toArray() # 객체 배열로 변환

package 컬렉션.세트;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        HashSet<String> hashset = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        hashset.add("4");
        hashset.add("2");
        hashset.add("3");
        hashset.add("1");
        hashset.add("4");
        hashset.add("3");

        linkedHashSet.add("100");
        linkedHashSet.add("101");
        linkedHashSet.add("102");

        treeSet.add("10");
        treeSet.add("20");
        treeSet.add("-1");
        treeSet.add("14");
        treeSet.add("-120");

        System.out.println("===== HashSet =====");
        Iterator<String> hashsetIterator = hashset.iterator(); // 키값만 중복 안되게

        while(hashsetIterator.hasNext())
            System.out.println(hashsetIterator.next());


        System.out.println("===== LinkedHashSet =====");
        Iterator<String> linkedHashSetTIterator = linkedHashSet.iterator(); // 넣는 순서대로 유지

        while(linkedHashSetTIterator.hasNext())
            System.out.println(linkedHashSetTIterator.next());

        System.out.println("===== TreeSet =====");

        Iterator<String> treeSetIterator = treeSet.iterator();
        while(treeSetIterator.hasNext())
            System.out.println(treeSetIterator.next());
    }

}
