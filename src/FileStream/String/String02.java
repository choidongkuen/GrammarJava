// 문자 스트림을 사용하는데 있어 버퍼링을 사용해보자
// BufferedReader,BufferedWriter

package FileStream.String;

import java.io.*;

public class String02 {

    public static void main(String[] args) throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/String/AdditionalTest"));
        BufferedReader in = new BufferedReader(new FileReader("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/String/AdditionalTest"));

        // 문자 스트림을 사용하는데 버퍼링을 사용한다.

        out.write("박지성 - 메시 멈추게 하는데 집중하겠다.");
        out.newLine(); // 하나의 개행 정보가 삽입된다.

        out.write("올 시즌은 나에게 있어 최고의 시즌이다.");
        out.newLine();

        out.write("팀이 승리하는 것을 돕기 위해 최선을 다하겠다.");
        out.newLine();

        out.close();
        System.out.println("기사 입력 완료!");

        //////////////////////////////////////////////////

        String str;
        while (true) {
            str = in.readLine();
            if (str == null)
                break;

            System.out.println(str);
        }
        in.close();
    }
}
