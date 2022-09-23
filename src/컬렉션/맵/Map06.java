// 문제 : 숫자 등장 횟수
// 문제 설명 : n 개의 숫자로 이루어진 수열 정보가 하나 주어졌을 때, m번에 걸쳐 특정 숫자가 주어지면 해당 숫자가 수열에 몇 개 있는지를 출력하는 프로그램을 작성해보세요.
// 입력 형식 :
// 첫 번째 줄에는 원소의 개수 n과 질의의 수 m이 공백을 사이에 두고 주어집니다.
// 두 번째 줄에는 n개의 원소가 공백을 사이에 두고 주어집니다.
// 세 번째 줄에는 m개의 숫자가 공백을 사이에 두고 주어집니다.
// 1 ≤ m ≤ n ≤ 100,000
// 1 ≤ 주어지는 원소, 숫자 값 ≤ 10^9

// 입력 예시 :
// 5 2
// 1 1 3 2 3
// 1 4

// 출력 예시 :
// 2 0

package 컬렉션.맵;

import java.util.*;

public class Map06 {

    public static int MAX = 100000;
    public static int n,m;
    public static int[] arr = new int[MAX];

    public static void main(String[] args) {
        // Your Program Goes Here
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();

            if(hashMap.containsKey(arr[i])){
                hashMap.replace(arr[i],hashMap.get(arr[i]) + 1);
            }else{
                hashMap.put(arr[i],1);
            }
        }

        for(int i = 0; i < m; i++){
            int in = sc.nextInt();

            if(hashMap.containsKey(in)){
                System.out.print(hashMap.get(in)+ " ");
            }else{
                System.out.print(0+" ");
            }
        }
    }
}