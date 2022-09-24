// 문제 : 대응되는 수와 문자

// 문제 설명 :
// n개의 문자열이 주어집니다. 각 문자열은 1부터 n까지 주어진 순서대로 각각 하나의 숫자와 대응됩니다.
// 이 후, 조사할 m개의 숫자 혹은 문자열이 주어졌을 때, 숫자에 대해서는 대응되는 문자열을, 문자열에 대해서는 대응되는 숫자를 출력하는 프로그램을 작성해보세요.

// 입력 형식 :
// 첫 번째 줄에는 숫자의 개수 n과 조사할 값의 개수 m이 공백을 두고 주어집니다.
// 두 번째 줄 부터 n + 1 번째 줄 까지는 번호에 해당하는 문자열을 입력받습니다. 문자열은 전부 알파벳 소문자로만 이루어져 있으며, 동일한 문자열이 주어지지 않음을 가정해도 좋습니다.
// n + 2 번째 줄 부터 n + m + 1 번째 줄 까지는 조사할 문자열이나 번호를 입력받습니다. 잘못된 입력은 주어지지 않는다고 가정해도 좋습니다.
// 1 ≤ n ≤ 100,000
// 1 ≤ m ≤ 100,000
// 1 ≤ 문자열의 길이 ≤ 20
// 1 ≤ 조사할 숫자 ≤ n

// 입력 얘시 01 :
// 5 2
// a
// b
// c
// d
// e
// 3
// c


// 출력 예시 01 :
// c
// 3

// 입력 예시 02 :
// 5 3
// qw
// er
// ty
// ui
// op
// 2
// ty
// op

// 출력 예시 02 :
// er
// 3
// 5

package 컬렉션.맵;

import java.util.HashMap;
import java.util.Scanner;

public class Map08 {
    public static final int MAX = 100000; // 10의 5승
    public static HashMap<String,Integer> hashMap = new HashMap<>(); // String - Integer
    public static String[] arr = new String[MAX]; // 원소 = 문자열
    public static int n,m;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
            hashMap.put(arr[i], i + 1);
        }

        for(int i = 0; i < m; i ++){
            String key = sc.next();

            if(key.charAt(0) <= '9' && key.charAt(0) >= '0'){
                System.out.println(arr[Integer.parseInt(key) - 1]); // key가 숫자인 경우
            }else {
                System.out.println(hashMap.get(key)); // key가 문자열인 경문
            }
        }
    }
}
