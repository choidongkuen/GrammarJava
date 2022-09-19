// int 및 short 자료형(정수형)의 한계 : 큰 수 표현 불가
// float 및 double 자료형(실수형)의 한계 : 정밀한 값 표현 불가

// BigInteger Class 의 인스턴스도 값 변경이 불가하다.


package BigInteger_BigDecimal;

import java.math.BigInteger;

public class Big01 {
    public static void main(String[] args) {
        System.out.println("정수의 최대값 : " + Integer.MAX_VALUE);
        System.out.println("정수의 최소값 : " + Integer.MIN_VALUE);

        BigInteger bigInt = new BigInteger("1000000000000000"); // 문자열을 매개변수에 대입
        BigInteger smallInt = new BigInteger("-99999999999999999");

        BigInteger addResult = bigInt.add(smallInt); // 메소드 add 를 이용하여 연산
        BigInteger multiResult = bigInt.multiply(smallInt); // 메소드 multiply 이용하여 연산

        System.out.println("큰 수의 덧셈 결과 : " + addResult);
        System.out.println("큰 수의 곱셈 결과 : " + multiResult);
    }
}
