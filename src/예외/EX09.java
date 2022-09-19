package 예외;

import java.util.Scanner;

class AgeInputException03 extends Exception{ // 예외 클래스 01(잘못된 나이 입력)
    public AgeInputException03(){
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}
class NameLengthException extends Exception{ // 예외 클래스 02(잘못된 이름 입력)

    String wrongName; // 잘못 입력된 이름
    public NameLengthException(String name){
        super("잘못된 이름이 삽입되었습니다.");
        this.wrongName = name;
    }
    public void showWrongName(){
        System.out.println("잘못된 이름 : " + this.wrongName);
    }
}
class PersonalInfo{
    String name;
    int age;

    public PersonalInfo(String name ,int age){
        this.name = name;
        this.age = age;
        this.showPersonalInfo();
    }
    public void showPersonalInfo(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}

public class EX09 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            PersonalInfo readInfo = readPersonalInfo(); // PersonalInfo 객체 생성시 예외 상황 발생 여지 존재
            readInfo.showPersonalInfo(); // 정보 출력
        }catch(AgeInputException03 e){
            e.printStackTrace();
        }catch(NameLengthException e){
//            e.showWrongName();
            e.printStackTrace();
        }
    }

    public static PersonalInfo readPersonalInfo() // PersonalInfo 인스턴스를 생성한 후, 반환하는 메소드
        throws AgeInputException03,NameLengthException{ // 해당 예외 상황 발생시 호출 영역으로 처리를 넘기겠다.
        String name = readName();
        int age = readAge();

        PersonalInfo pInfo = new PersonalInfo(name ,age);
        return pInfo;
    }

    public static String readName() throws NameLengthException {

        System.out.print("이름 입력 : ");
        String name = sc.next();
        if(name.length() < 2)
            throw new NameLengthException(name);

        return name;
    }

    public static int readAge() throws AgeInputException03{

        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        if(age < 0)
            throw new AgeInputException03();
        return age;
    }
}
