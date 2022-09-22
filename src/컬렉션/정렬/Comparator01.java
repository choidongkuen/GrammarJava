// Comparator는 언제 쓸끼?
// 많이 쓰이는 String 클래스는 사전편찬 순으로 정렬되도록 이미 오버라이딩 되어있으며, 당연히 Comparable 인터페이스를 구현하고 있다.
// 그러나 간혹 사용자가 원하는 정렬 방법으로 문자열을 정렬하고 싶을 때가 있을 것이다. (ex. 문자열의 길이 순으로 정렬)
// 이렇듯, 이미 정렬 방법이 존재하는 경우 or 어떠한 이유로 딱 한번 사용자가 원하는 방법으로 정렬하고 싶을 때, 사용하는 것이 Comparator 인터페이스이다.
// Comparator 인터페이스에 대표적인 메소드로 int compare(T obj1 T obj2) 가 존재한다. # 참고 obj1 기준으로 생각하자!!!

package 컬렉션.정렬;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class ComparatorTest implements Comparator<String>{ // Comparator의 비교대상 == String

    public int compare(String s1, String s2){
        return s1.length() - s2.length();
    } // 길이순으로 오름차순 정렬
}

public class Comparator01 {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>(new ComparatorTest()); // Comparator 인터페이스를 구현하는 인스턴스의 참조값 전달

        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("WaterMelon");
        treeSet.add("StrawBerrys");

        Iterator<String> itr = treeSet.iterator();

        while(itr.hasNext()){
            System.out.println("itr.next() = " + itr.next());
        }
    }
}
