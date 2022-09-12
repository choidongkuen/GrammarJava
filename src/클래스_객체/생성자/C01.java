package 클래스_객체.생성자;

public class C01 {
    public String name; // 이름
    public int age; // 나이
    public String gender; // 성별
    public String department; // 학과
    public long studentNumber; // 학번

    public C01(){} // 기본 생성자

    public C01(String name,int age, String gender,String department,long studentNumber) { // 사용자 정의 생성자
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.studentNumber = studentNumber;
    } // 개인 정보 + 학생 정보

    public C01(String name,int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    } // 개인 정보
}
