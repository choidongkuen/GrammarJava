// 인스턴스의 비교 기준을 정의하는 Comparable<T>,Comparator<T> 인터페이스
// 특정 클래스의 인스턴스를 저장하는 인스턴스 자료구조가 있다고 할 때, 해당 자료구조에다 객체를 사용자가 정한 정렬 기준으로 어떻게 정렬할까?

// Solution01 : Comparable<T> 인터페이스 사용
// 작동 원리 : 해당 인스턴스가 특정 자료구조에 삽입할 때마다, 기존에 존재하고 있던 다른 인스턴스와 사용자가 정한 정렬기준으로 비교하여 정렬한다.
// 사용자가 정의한 클래스를 배열에 담고, 사용자가 정의한 정렬 기준으로 정렬해보자.

package 컬렉션.정렬;


import java.util.Arrays;

class StudentClass implements Comparable<StudentClass>{

    String name;
    int studentNum;
    int age;
    // 학번 순으로 정렬을 원함

    public StudentClass(String name, int studentNum, int age){
        this.name = name;
        this.studentNum = studentNum;
        this.age = age;
    }

    @Override
    public int compareTo(StudentClass s){

        return this.studentNum - s.studentNum; // 학번 순으로 정렬
    }

    public String toString(){
        return this.name + " " + this.age + " " + this.studentNum;
    }


}
public class Comparable01 {
    public static void main(String[] args) {

        StudentClass[] students = new StudentClass[4];

        students[0] = new StudentClass("최동근", 20221201, 25);
        students[1] = new StudentClass("박건욱",20201201,23);
        students[2] = new StudentClass("이진성",20190312,21);
        students[3] = new StudentClass("함진수",20150212,22);



        Arrays.sort(students);

        for (int i = 0; i < 4 ; i++) {
            System.out.println(students[i]);
        }

    }
}
