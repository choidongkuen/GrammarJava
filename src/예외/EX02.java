// 가장 일반적인 예외 처리 방법으로는 'if문 처리 방식'이 있으나, if 문의 본래 목적은 예외처리가 아니기에, 프로그램 코드 상에서 예외처리 부분을 구분하기 쉽지 않다.
// -> Try ~ catch

// if 문으로 예외처리 해보기
package 예외;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[100];

        for(int i = 0; i < 3; i ++){
            System.out.print("피제수 입력 : ");
            int num1 = sc.nextInt(); // 숫자 입력

            System.out.println("제수 입력 : ");
            int num2 = sc.nextInt(); // 숫자 입력

            if(num2 == 0){
                System.out.println("0으로 나눌 수 없습니다.");
                i -= 1;
                continue;
            }
            System.out.print("연산결과를 저장할 배열의 인덱스 입력 : ");
            int idx = sc.nextInt();

            if(idx < 0 || idx > 99){

                System.out.println("인덱스가 적절치 않습니다.");
                i -= 1;
                continue;
            }

            arr[idx] = num1 / num2; // 예외 사항 없을시, 저장
            System.out.println("나눗셈 결과 : " + arr[idx]);
            System.out.println("저장한 위치의 인덱스 : " + idx);
        }
    }
}
// 위에 코드는 Divide by Zero 에러와 IndexOutOfRange 에러를 if문으로 처리하는 코드이다.