// 컬렉션 클래스를 Comparable 인터페이스를 이용해서 정렬해보자.
// 사용자가 정의한 클래스를 TreeSet에 담고, 사용자가 정의한 정렬 기준으로 정렬해보자.
// # 참고  TreeSet : 정렬하여 인스턴스를 저장

package 컬렉션.정렬;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

class People implements Comparable<People>{

    private String name;
    private int age;
    private int weight;

    public People(String name ,int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int compareTo(People p){
        return this.weight - p.weight; // 몸무게 순으로 정렬
    }
    public String toString(){
        return this.name + " " + this.age + " " + this.weight;
    }

    public void showData(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("weight = " + weight);
    }
}

public class Comparable02 {

    public static TreeSet<People> treeSet = new TreeSet<>();
    public static void main(String[] args) {

        treeSet.add(new People("최동근",26,76));
        treeSet.add(new People("박건구",26,68));
        treeSet.add(new People("장현수",22,100));

        Iterator<People> itr = treeSet.iterator();

        while(itr.hasNext())
            System.out.println("itr.next() = " + itr.next());

    }
}
