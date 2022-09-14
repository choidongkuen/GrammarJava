package 컬렉션.정렬;

public class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override // Comparable
    public int compareTo(Student o) {
         return this.age - o.age; // 오름차순 정력
    }

    @Override // Object
    public String toString(){
        return "name : " + this.name +", age : " + this.age;
    }
}
