package 컬렉션.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(); // Student 클래스가 Comparable 인터페이스를 상속받아야 정렬 가능!! -> 인터페이스의 역할 : 다른 클래스와의 차이를 만듬


        students.add(new Student("최동근",26));
        students.add(new Student("박건구",14));
        students.add(new Student("빙상민",22));
        students.add(new Student("이진우",54));
        students.add(new Student("김재우",24));

        for(Student s : students){
            System.out.println(s.toString()); // toString 메소드가 오버라이딩 되어있지 않는다면, 패키지 정보 + 해시값 출력
        }

        System.out.println(" ============ 정렬 =========== ");
        Collections.sort(students);

        for(Student s : students){
            System.out.println(s.toString()); // toString 메소드가 오버라이딩 되어있지 않는다면, 패키지 정보 + 해시값 출력
        }





    }
}
