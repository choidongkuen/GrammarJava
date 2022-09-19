// 문자열을 구분자(delimiter) 기준으로 나누는 것을 tokenizer 라고 한다.
// StringTokenizer 클래스 존재
// hasMoreToken(), nextToken() 메소드 !!

package StringTokenTest;


import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {

        String str = "08:45:11:22:33:44";
        StringTokenizer st = new StringTokenizer(str,":");

        while(st.hasMoreTokens())
            System.out.print(st.nextToken()+" ");
    }
}
