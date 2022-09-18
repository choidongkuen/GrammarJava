// try ~ catch 문으로 예외처리 해보기 01

package 예외;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        System.out.println("두 개의 정수 입력:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();


        try{
            System.out.println("나눗셈 결과의 몫 : " + x / y);
            System.out.println("나눗셈 결과의 나머지 : " + x % y); // ArithmeticException 에러 발생시
        }catch(ArithmeticException e){ // ArithmethicException 객체 생성(참조값)하여 catch 매개변수에 대입 by JVM
            System.out.println("나눗셈 불가능!");
            e.printStackTrace(); // 해당 객체에 printStackTrace() 메소드 호출
        }
    }
}
