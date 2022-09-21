package FileStream.String;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class String02 {

    public static void main(String[] args) throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/String/AdditionalTest"));
        // 문자 스트림을 사용하는데 버퍼링을 사용한다.

        out.write("박지성 - 메시 멈추게 하는데 집중하겠다.");
        out.newLine();

        out.write("올 시즌은 나에게 있어 최고의 시즌이다.");
        out.newLine();

        out.write("팀이 승리하는 것을 돕기 위해 최선을 다하겠다.");
        out.newLine();

        out.close();
        System.out.println("기사 입력 완료!");


    }
}
