// String 클래스는 이미 사전편찬순으로 정렬하도록 정의되어있다.
// 따라서 길이순으로 정렬되도록 별도의 Comparator 인터페이스를 구현하는 클래스를 설계해야한다.

package 컬렉션.세트;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StrLenComparator implements Comparator<String>{ 
    
    @Override
    public int compare(String str1, String str2){
        return str1.length() - str2.length();
    } // compare 메소드 구현
}
public class Set08 {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>(new StrLenComparator()); // 인자로 StrLenComparator 인스턴스를 주고있음
        
        treeSet.add("최");
        treeSet.add("동근");
        treeSet.add("한국외대");
        treeSet.add("5군단");
        treeSet.add("시흥시정왕동");

        System.out.println("treeSet.size() = " + treeSet.size());

        Iterator<String> itr = treeSet.descendingIterator(); // 내림차순으로 정렬하는 Iterator
        while(itr.hasNext()){
            System.out.println("itr.next() = " + itr.next());
        }
    }
}
