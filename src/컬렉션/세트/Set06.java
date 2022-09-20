// 특정 클래스의 인스턴스를 TreeSet 에 저장하려면 해당 클래스가 Comparable 인터페이스를 구현해야 한다.
// 이를 통해 정렬 기준을 결정해야 한다.

package 컬렉션.세트;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{

    int age;
    String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Person o) {
        return this.age - o.age; // 오름차순 정렬
    }
    public void showData(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}

public class Set06 {

    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person(26,"최동근"));
        treeSet.add(new Person(24,"박건구"));
        treeSet.add(new Person(20,"김진영"));
        treeSet.add(new Person(19,"서연수"));

        System.out.println("treeSet.size() = " + treeSet.size());

        Iterator<Person> itr = treeSet.iterator();
        while(itr.hasNext()){
            itr.next().showData();
        }
    }
}
