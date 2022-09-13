// 다운캐스팅이란 상위 클래스형으로 업캐스팅 후, 다시 원래대로(하위 클래스형) 돌아오는 것을 가리킨다.
// 일종의 '확대' 역할
// 명시적인 형변환 연산자가 필요, 없으면 컴파일 에러
//

package 상속.다형성.다운캐스팅;


public class DownCasting {
    public static void main(String[] args) {
        SchoolStaff ss1 = new SchoolStaff("최동근",1111,"한국 외국어대학교",2222,"입학처");

        Human h1 = ss1;
        Staff s1 = ss1; // 업캐스팅

        System.out.println(h1.name); // 사람 이름
        System.out.println(h1.number); // 주민번호

        System.out.println(s1.name); // 사람 이름
        System.out.println(s1.schoolName); // 학교 이름

        SchoolStaff ss2 = (SchoolStaff)h1;
        SchoolStaff ss3 = (SchoolStaff)s1; // 다시 하위 클래스로 다운 캐스팅
    }
}
