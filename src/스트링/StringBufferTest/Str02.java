// 문제 1: String str = "ABCDEFGHIJKLMNOP" 를 역순으로 출력하는 프로그램을 작성하시오.
// 문제 2: String str = "971201-1216826" 에서 "-" 을 삭제한 번호만 출력하시오.

package 스트링.StringBufferTest;

class Solution01{

    StringBuffer sb = new StringBuffer();

    public String solution01(String str){

        for (int i = str.length() - 1; i >= 0 ; i --) {
            sb.append(str.charAt(i));
        }

        String result = sb.toString(); // 결과를 문자열로
        return result;
    }
}

class Solution02{

    StringBuffer sb = new StringBuffer();

    public String solution02(String str){

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '-')
                continue;
            sb.append(str.charAt(i));
        }

        String result = sb.toString();
        return result;
    }
}
public class Str02 {

    public static void main(String[] args) {

        String str1 = "ABCDEFGHIJKLMONOP"; // 해당 문자열을 역순 출력
        System.out.println(new Solution01().solution01(str1));

        String str2 = "971201-1216826";
        System.out.println(new Solution02().solution02(str2));

    }
}
