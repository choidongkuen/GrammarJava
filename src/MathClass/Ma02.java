// 난수 생성하기
// Random 클래스 java.util 에 존재

package MathClass;
import java.util.ArrayList;
import java.util.Random;

public class Ma02 {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

        Random random = new Random(); // Random 클래스의 인스턴스 생성

        for(int i = 0 ; i < 100; i++){
            list.add(random.nextInt(101)); // 0 ~ 100 이하 정수형 난수
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        } // 100개의 0 이상 100 이하 정수형 난수 출력
    }
}
