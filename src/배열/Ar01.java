package 배열;

import java.util.Arrays;

public class Ar01 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = arr1; // 얕은 복사

        int[] b1 = {1,2,3,4};
        int[] b2 = new int[b1.length];

        for(int i = 0; i < b1.length; i++)
            b2[i] = b1[i]; // 깊은 복사

        int[] c1 = {1,2,3,4};
        int[] c2 = c1.clone(); // 깊은 복사

        int[] d1 = {1,2,3,4};
        int[] d2 = Arrays.copyOf(d1,d1.length); // 깊은 복사

        int[] e1 = {1,2,3,4};
        int[] e2 = new int[e1.length];
        System.arraycopy(e1,0,e2,0,e1.length); // 깊은 복사

    }
}
