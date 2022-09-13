// 업캐스팅이란 상위 클래스형의 참조 변수로 하위 클래스의 인스턴스를 가리키는 것이다.
// 왜 사용 할까? 일종의 '제한' 역할
// 업캐스팅을 하면, 하위 인스턴스의 멤버를 참조 할 수 없으며 오로지 상위 인스턴스의 멤버만 사용가능하다.

package 상속.다형성.업캐스팅;

public class UpCasting {
    public static void main(String[] args) {

        Human h1 = new Human("최동근",26);
        System.out.println(h1.name+", "+h1.number);

        Staff s1 = new Staff("박하은",12345,"한국외국어대학교",11111);
        System.out.println(s1.name);
        System.out.println(((Human)s1).number); // Staff -> Human 업캐스팅
        System.out.println(s1.schoolName);
        System.out.println(s1.number);


        SchoolStaff ss1 = new SchoolStaff("박하영",2222,"조선대학교",3333,"입학처");
        ss1.department = "사무처";

        Human h2 = ss1; // SchoolStaff -> Human 업캐스팅
        Staff s2 = ss1; // SchoolStaff -> Staff 업캐스팅

        System.out.println(h2.name +", " + h2.number);
        System.out.println(s2.name +", " + s2.number);
        System.out.println(ss1.department);
    }
}
