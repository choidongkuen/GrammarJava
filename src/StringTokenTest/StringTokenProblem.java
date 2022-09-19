package StringTokenTest;

import java.util.StringTokenizer;

public class StringTokenProblem {

    public static void main(String[] args) {

        String phoneNum = "TEL 82-02-997-2059";
        String javaCode = "num+=1";

        System.out.println("First Result....");
        StringTokenizer st = new StringTokenizer(phoneNum); // 구분자가 존재 x -> 공백을 기준으로 토큰이 나뉜다.

        while(st.hasMoreTokens()){
            System.out.print(st.nextToken()+ " ");
        }

        System.out.println("\nSecond Result....");
        StringTokenizer st1 = new StringTokenizer(phoneNum," -"); // 구분자가 2개(space bar , -)

        while(st1.hasMoreTokens()){
            System.out.print(st1.nextToken()+" ");
        }

        System.out.println("\nThird Result....");
        StringTokenizer st2 = new StringTokenizer(javaCode,"+=");//,true); // 마지막 true 는 구분자도 출력한다는 뜻

        while(st2.hasMoreTokens()){
            System.out.print(st2.nextToken()+" ");
        }

    }
}
