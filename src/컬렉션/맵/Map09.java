// 문제 : 낮은 지점들
// 문제 설명 :
// 2차 평면 위에 n개의 점이 주어졌을 때, 동일한 x좌표를 갖는 점들에 대해서는 그 중 가장 작은 y값을 갖는 점을 제외한 다른 점들은 전부 제거하여 하나의 x좌표 당 최대 하나의 점만 놓여져 있도록 만들려고 합니다.
// 이후 남아있는 점들의 y값의 합을 구하는 프로그램을 작성해보세요.

// 입력 형식 :
// 첫 번째 줄에는 원소의 개수 n이 주어집니다.
// 두 번째 줄부터는 n개의 줄에 걸쳐 한 줄에 하나씩 해당 점의 위치 (x, y)가 공백을 사이에 두고 주어집니다. 모든 점은 서로 다른 위치에 놓여있음을 가정해도 좋습니다.
// 1 ≤ n ≤ 100,000
// −10 ^ 9≤ x, y ≤ 10 ^ 9

// 입력 예시 :
// 5
// 1 3
// 2 5
// -1 6
// 2 4
// -1 9

// 출력 예시 :
// 13

package 컬렉션.맵;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Map09 {

    public static final int MAX = 100000; // 주어지는 원소의 최대 갯수
    public static HashMap<Integer,Integer> hashMap = new HashMap<>(); // x - y

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i ++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(hashMap.containsKey(x)){ // 해당 x가 존재할 때
               hashMap.put(x,Math.min(y,hashMap.get(x))); // 최소의 y값으로 업데이트
            }else{ // 해당 x가 존재하지 않을 때
                hashMap.put(x,y);
            }
        }

        Set<Integer> keySet = hashMap.keySet();

        long result = 0;
        for(Integer key : keySet){
            result += hashMap.get(key); // y값을 모두 더함
        }

        System.out.println(result);
    }
}
