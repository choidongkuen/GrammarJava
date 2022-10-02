// Map11에 대한 투포인터 ver

package 컬렉션.맵;

import java.util.Arrays;
import java.util.Scanner;

public class Map11 {
    public static final int MAX = 100000;
    public static int n,k;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 오름차순 정렬

        int p1 = 0;
        int p2 = n - 1;
        int ans = 0;

        while(p1 < p2){ // 두 점이 동일해지면 stop!
            if(arr[p1] + arr[p2] == k){
                ans ++;
                p1 ++;
                p2 --;
            }else if(arr[p1] + arr[p2] < k){
                p1++;
            }else{
                p2--;
            }
        }
        System.out.println(ans);
    }
}
// 결론 : 서로다른 양의 정수라는 조건이 없기에 투포인터로 문제를 풀 수 없다.
// 예시 :
// 5, 6
// 3 3 3 3 3
