// 사용자 정의 예외 상황(논리적 예외 상황)은 사용자가 따로 예외 클래스를 만들어서 설계해야 한다.
// 예외 클래스는 Exception 클래스를 상속해야 한다.

// throw 키워드는 예외 상황이 발생했음을 JVM 에게 알리는 키워드이다.
// throws 키워드는 해당 영역에서 발생한 예외 상황 처리를 자신을 호출한 영역으로 넘기겠다는 키워드이다.
// 즉, throw 에 의해 생성된 예외 상황은 반드시 try ~ catch 문에 의해 처리되거나, throws 에 의해 넘겨져야 한다 !!

package 예외;

import java.util.Scanner;

class AgeInputException extends Exception{ // 예외 클래스
    public AgeInputException(){
        super("유효하지 않은 나이가 입력되었습니다."); // 예외 발생시, 출력하고자 하는 메세지는 예외 클래스의 생성자 호출을 통해 정의하면 된다.
    }
}

public class EX07 {
    public static void main(String[] args) {

        System.out.print("나이를 입력하세요 : ");

        try {

            int age = readAge();
            System.out.println("당신은 " + age + "세 입니다.");
        }
        catch (AgeInputException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int readAge() throws AgeInputException{
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 0){

            AgeInputException excpt = new AgeInputException(); // 사용자 정의 예외 클래스 인스턴스 생성
            throw excpt;
        }
        return age;

    }

}
