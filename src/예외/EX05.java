// try - catch 는 한 구문이다.
// 하나의 try 영역에 여러가지 오류 가능성이 있다면, 여러 catch 문을 추가 할 수 있다.

// 만약 예외상황이 발생하여 예외 클래스의 인스턴스가 생성되고 나면, 위에서 아래로 적잘한 catch 영역을 찾게 된다.
// 만약 해당하는 catch 문을 만나 catch 문이 실행이 된다면, 예외처리는 종결된다. (즉 , 더이상 밑에 catch 문 고려하지 않음)
//


package 예외;

import java.util.Scanner;

public class EX05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        for(int i = 0; i < 3; i ++){
            try{
                System.out.print("피제수 입력 : ");
                int num1 = sc.nextInt();

                System.out.print("제수 입력 : ");
                int num2 = sc.nextInt();

                System.out.print("해당 연산 결과를 저장할 배열의 인덱스 입력 : ");
                int idx = sc.nextInt();

                arr[idx] = num1 / num2;
                System.out.println("나눗셈 결과 : " + arr[idx]);
                System.out.println("저장된 위치의 인덱스 : "  + idx);

                // 두가지 에러 가능성 존재
                // 1. 제수가 0일 수 있는 오류 존재
                // 2. 인덱스가 해당 배열에 대하 적절하지 않은 인덱스일 가능성 존재
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("제수는 0이 될 수 없습니다.");
                i -= 1; // 다시 입력
                continue; // for loop 다시
            }catch(IndexOutOfBoundsException e){
                System.out.println("유효하지 않은 인덱스입니다.");
                i -= 1; // 다시 입력
                continue; // for loop 다시
            }
        }
    }
}
