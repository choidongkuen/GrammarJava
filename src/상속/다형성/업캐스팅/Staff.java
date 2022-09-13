package 상속.다형성.업캐스팅;

public class Staff extends Human { // 교직원 클래스
    public String schoolName;
    public long staffNumber;

    public Staff(String name, long number, String schoolName, long staffNumber){
        super(name,number); // 상위 클래스 생성자 호출
        this.schoolName = schoolName;
        this.staffNumber = staffNumber;

    }
}
