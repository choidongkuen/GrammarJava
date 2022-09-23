// 문제 : 아주 큰 숫자를 Array의 index로 사용하기
// 문제 설명 :
// 서로 다른 6개의 숫자가 주어진 뒤 끝에 숫자 k가 주어졌을 때,
// 숫자 k가 몇 번째로 주어졌는지를 판단하는 프로그램을 작성해보세요.
// 단, 주어지는 숫자의 범위는 -10^9 ~ 10^9 사이입니다.
// 예를 들어 [-656, 234, 65756344, 7678678, 123123, 567567567] 에서
// k가 65756344라면, 3번째로 주어진 숫자이므로 답은 3이 됩니다.

// 입력 예시 :
// 6 # n
// 1 # k
// 4 2 1 6 5 7
// 출력 예시 :
// 3


// 솔루션 01 : 배열로 풀기
// 솔루션 02 : HashMap으로 풀기

package 컬렉션.맵;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution05{

    public static int solution01(int[] arr,int target){ // 반복문 풀이법

        int result = -1;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] == target) {
                result = i + 1;
                return result;
            }
        }
        return result;
    }
    public static int solution02(int[] arr,int target){ // Map 풀이법
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0 ; i < arr.length; i ++)
            hashMap.put(arr[i],i + 1);

        return hashMap.get(target);
    }
}

public class Map05 {
    public static int MAX_N = 6; // 6자리
    public static int[] arr = new int[MAX_N]; // 1차원 배열
    public static int n,k; // 주어지는 원소 갯수,주어지는 원소

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // 배열 원소 입력

        Solution05 s = new Solution05();
        System.out.println(" ===== solution01 ===== ");
        System.out.println(s.solution01(arr,k));

        System.out.println(" ===== solution02 ===== ");
        System.out.println(s.solution02(arr,k));

    }
}
