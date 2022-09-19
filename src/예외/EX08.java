package 예외;

import java.util.Scanner;

class AgeInputException02 extends Exception{

    public AgeInputException02(){
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}
public class EX08 {

    public static void main(String[] args) throws AgeInputException02 { // main 메소드를 호출한 영역으로 넘겨버렸다. -> 가상머신이 호출하는 메소드
        System.out.print("나이를 입력하세요 : ");
        int age = readAge();
        System.out.println("당신의 나이는 " + age + "입니다.");
    }

    public static int readAge() throws AgeInputException02{ // readAge 메소드를 호출한 영역으로 넘겨버렸다.
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age < 0){
            AgeInputException02 excpt = new AgeInputException02();
            throw excpt; // 예외 발생!
        }
        return age;
    }
}
