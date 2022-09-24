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
                System.out.println(hashMap.get(key)); // key가 문자열인 경우
            }
        }
    }
}
