package 상속.다형성.업캐스팅;

public class SchoolStaff extends Staff { // 직원 클래스
    public String department;

    public SchoolStaff(String name, long number, String schoolName, long staffNumber,String department){
        super(name,number,schoolName,staffNumber); // 상위 클래스의 생성자 호출
        this.department = department;
    }
}
