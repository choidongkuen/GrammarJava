// 다차원 배열

package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ar02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];


        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();

        System.out.println(Arrays.deepToString(arr));
    }
}
