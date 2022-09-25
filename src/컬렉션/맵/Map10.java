package 컬렉션.맵;

import java.util.HashMap;
import java.util.Scanner;

public class Map10 {
    public static final int MAX = 100000; // 10의 5승
    public static int n,k;

    public static int[] arr = new int[MAX];
    public static HashMap<Integer,Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 원소의 갯수
        k = sc.nextInt(); // 목표 값

        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();

        }
    }
}
