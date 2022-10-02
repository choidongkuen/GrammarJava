// 날짜 : 2022/09/27
// 문제 : 두 수의 합
// 문제 설명 :
// n개의 정수가 입력으로 주어지고, 이 중 '서로 다른 위치에 있는 두 개의 수를 뽑아 더했을 때 k가 되는 가짓수'를 구하는 프로그램을 작성해보세요.

// 입력 형식 :
// 첫 번째 줄에는 원소의 개수 n과 두 수의 합이 될 k가 공백을 사이에 두고 주어집니다.
// 두 번째 줄에는 n개의 정수가 공백을 사이에 두고 주어집니다. '수가 중복되어 주어질 수 있습니다.'

// -10 ^ 9 <= 정수 <= 10 ^ 9
// 1 <= n < 100000
// -2 ^ 31 <= k <= 2^31 - 1


// 아이디어 :
// 1. hashMap
// 2. twoPointer - > "Map11번"
// 배열에 대한 for문을 돌면서 diff가 있는지 확인
// 나중에 diff가 arr[i]로 나올 수 있음으로, arr[i]의 횟수 기록


// Map11 꼭 풀어보기!!!!!!

package 컬렉션.맵;

import java.util.HashMap;
import java.util.Scanner;

public class Map10 {
    public static final int MAX = 100000; // 원소의 최대 갯수
    public static int n,k;
    public static int[] arr = new int[MAX]; // n개의 원소가 들어갈 1차원 배열
    public static int cnt = 0;// 두수의 합이 k가 되는 가짓수
    public static HashMap<Integer,Integer> hashMap = new HashMap<>(); // 원소 - 배열에서의 인덱스

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        } // 원소 입력

        for (int i = 0; i < n ; i++) {

            int diff = k - arr[i]; // 해당하는 차이가 hashMap에 존재하며, 해당 key가 배열에서 위치하는 인덱스와 i가 달라야 한다.

            if(hashMap.containsKey(diff)){
                cnt += hashMap.get(diff);
            }
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0) + 1);

        }
        System.out.println(cnt);
    }
}
