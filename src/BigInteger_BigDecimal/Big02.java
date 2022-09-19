// BigDecimal 사용해보기

package BigInteger_BigDecimal;

import java.math.BigDecimal;

public class Big02 {
    public static void main(String[] args) {

        double e1 = 1.6;
        double e2 = 0.1;

        System.out.println(e1 + e2);
        System.out.println(e1 - e2); // 오차 존재

        BigDecimal e3 = new BigDecimal(1.6);
        BigDecimal e4 = new BigDecimal(0.1); // 이런식으로 실수 자체를 매개변수로 전달하면 매개변수 전달 부터 오차가 존재 -> 문자열로 전달!!

        System.out.println(e3.add(e4));
        System.out.println(e3.subtract(e4));

        BigDecimal e5 = new BigDecimal("1.6");
        BigDecimal e6 = new BigDecimal("0.1"); // 매개변수 형식이 BigInteger 와 동일하다.

        System.out.println(e5.add(e6));
        System.out.println(e6.subtract(e6)); // 오차 존재 x
    }
}
