import java.lang.reflect.Array;
import java.util.*;
/*
public class Main {
    public static final int MAX_N = 100; // n의 최대값 (정해진 상수 값 : static final)
    public static int[] arr = new int[MAX_N]; // 최대 갯수의 원소를 담을 수 있는 1차원 배열
    public static int n; // 실제 n값

    public static void printArray(){

        for(int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");

    }

    public static void main(String[] args) {
        // Your Program Goes Here
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt(); // 원소 입력

        for(int i = 1; i < n; i++){ // 1부터 시작!
            int key = arr[i]; // 정렬할 위치의 원소
            int j = i - 1; // 정렬된 구간에 마지막 원소

            while(j > 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // key 보다 작은 arr[j]를 찾았을때, key는 그 다음 위치이다.
        }
        // 정렬 완료
        printArray(); // 프린트 메소드 호출
    }
}
*/
public class Main{
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{2,3,4});

        System.out.println(Arrays.toString(list.get(0)));
    }
}