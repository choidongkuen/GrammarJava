// 문제 : 두 인스턴스의 name 과 age 가 동일하다면 하나만 저장되도록 hashCode , equals 메소드를 제정의 하세요

package 컬렉션.세트;

import java.util.HashSet;
import java.util.Iterator;

class Student{

    String name;
    int age;

    public Student(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void showData(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    public int hashCode(){
        return age;
    }
    
    public boolean equals(Object obj){
        
        Student comp = (Student)obj;
        
        if(comp.hashCode() == comp.hashCode() && this.name.equals(comp.name)) // 이름과 나이가 같다면
            return true;
        
        return false;
    }

    public String toString(){
        return this.name +" "+this.age;
    }
}
public class Set04 {

    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<>();
        
        hashSet.add(new Student("최동근",26));
        hashSet.add(new Student("박건구",22));
        hashSet.add(new Student("최동근",26));
        hashSet.add(new Student("김진수",40));
        hashSet.add(new Student("박건구",22));

        System.out.println("hashSet.size() = " + hashSet.size());
        
        Iterator<Student> itr = hashSet.iterator();

        while(itr.hasNext())
            System.out.println("itr.next() = " + itr.next());
    }
}
