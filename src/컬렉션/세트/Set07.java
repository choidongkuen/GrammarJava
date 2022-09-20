// String 인스턴스는 기본적으로 사전편찬순으로 정렬하도록 compareTo 메소드가 구현되어 있다.
// 이를 길이순으로 정렬하도록 바꿔보자.

package 컬렉션.세트;

import java.util.Iterator;
import java.util.TreeSet;

class MyString implements Comparable<MyString>{ // 정렬을 위해 Comparable 인터페이스 구현

    String str;
    public MyString(String str){this.str = str;}
    public int getLength(){return this.str.length();}
    public String toString(){return str;}

    @Override
    public int compareTo(MyString o) {
        return this.getLength() - o.getLength();
    } // 만약 0이 나오면 저장 x
    // 정렬기준으로 정렬이 되는데, 정렬 기준이 어찌됬든 Iterator 의해 항상 오름차순으로 정렬
}
public class Set07 {

    public static void main(String[] args) {

        TreeSet<MyString> treeSet = new TreeSet<>();

        treeSet.add(new MyString("최"));
        treeSet.add(new MyString("동근"));
        treeSet.add(new MyString("무지개"));
        treeSet.add(new MyString("연필"));
        treeSet.add(new MyString("연필깎기"));

        System.out.println("treeSet.size() = " + treeSet.size());

        Iterator<MyString> itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.println("itr.next().toString() = " + itr.next().toString());
        }
    }
}
