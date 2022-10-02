package 컬렉션.맵;

import java.util.Arrays;
import java.util.Scanner;

public class Map12 {

    public static final int MAX = 1000;
    public static int[] arr;
    public static int n,k;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        Arrays.sort(arr); // 오름차순 정렬

        for (int i = 0; i < n - 2 ; i++) {
            int num = arr[i];

            int p1 = i + 1;
            int p2 = n - 1;

            while(p1 < p2){
                if(arr[p1] + arr[p2] + num == k){

                    if(arr[p1] == arr[p1 + 1]){
                        ans += 2;
                        p1 += 2;
                    }else{
                        ans += 1;
                        p1 ++;
                    }
                    p2 --;
                }
                else if(arr[p1] + arr[p2] + num < k){
                    p1 ++;
                }else{
                    p2 --;
                }
            }
        }
        System.out.println(ans);
    }
}
