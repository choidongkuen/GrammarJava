package 상속;

class UniversityStudent{
    public String name;
    public int age;
    public String gender;
    public String department;
    public static int universityName;

    public UniversityStudent(String name){
        this.name = name;
    }
    public UniversityStudent(String name, int age){
        this(name); // 다른 생성자 호출
        this.age = age;
    }

    public UniversityStudent(String name, int age, String gender){
        this(name,age); // 다른 생성자 호출
        this.gender = gender;
    }
    public UniversityStudent(String name ,int age, String gender, String department, String universityName){
        this(name,age,gender); // 다른 생성자 호출
        this.department = department;
    }

    public void showData(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("department = " + department);
        System.out.println("universityName = " + universityName);
    }
}

public class IH05 {
    public static void main(String[] args) {
        UniversityStudent us = new UniversityStudent("최동근",26,"M","Computer Science","Korea foreign");
        us.showData();
    }
}
