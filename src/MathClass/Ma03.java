// 실제 컴퓨터는 난수 생성이 매우 어렵다
// seed 가 되는 하나의 숫자를 기반으로 난수가 만들어지도록 설계
// seed 가 동일하면 난수도 무조건 동

package MathClass;

import java.util.Random;

public class Ma03 {
    public static void main(String[] args) {

        Random random = new Random(12); // 12 -> seed
        random.setSeed(System.currentTimeMillis()); // 현재 시간을 seed 로 설정 - > 매번 다른 값 전달

//        Random random1 = new Random(2);
//        Random random2 = new Random(2);
//        System.out.println(random1.nextInt());
//        System.out.println(random2.nextInt());

        for(int i = 0; i < 10; i ++)
            System.out.print(random.nextInt(11)+ " "); // seed 원리가 적용 x


        double randomDouble = Math.random(); // 0 ~ 1 사이에 double 형 난수 생성
        System.out.println(randomDouble);
    }
}
