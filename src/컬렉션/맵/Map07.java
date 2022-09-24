// 문제 : 가장 많은 데이터

// 문제 설명 :
// 알파벳 소문자로 이루어진 문자열들이 중복을 허용하여 입력되었을때, 최대로 등장한 문자열의 등장 횟수를 출력하는 프로그램을 작성해보세요.

// 입력 형식 :
// 첫 번째 줄에는 입력될 문자열의 개수 n이 주어집니다.
// 두 번째 줄부터 n + 1 번째 줄 까지 문자열들이 입력됩니다.
// 1 ≤ n ≤ 100,000
// 1 ≤ 문자열의 길이 ≤ 50

// 입력 예시 :
// 7
// red
// red
// red
// blue
// blue
// blue
// green

// 출력 얘시 :
// 3

// n의 범위가 10의 5승이기 때문에, 일반적인 완전탐색은 불가!
// hashMap을 이용해 String - 갯수의 map을 만들자.

package 컬렉션.맵;
import java.util.*;

public class Map07{

    public static final int MAX_N = 100000;
    public static String[] arr = new String[MAX_N]; // 주어지는 1차원 배열
    public static void main(String[] args) {
        // Your Program Goes Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < n; i ++){

            arr[i] = sc.next();
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i]) + 1);
            }else{
                hashMap.put(arr[i],1);
            }
        }
        int maxCnt = Collections.max(hashMap.values());
        System.out.println(maxCnt);
    }
}