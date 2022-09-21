// 문자 스트림에 최상위 클래스는 Writer,Reader 가 있다.
// 동시에 파일 문자 스트림에는 FileReader,FileWriter 가 있다.

package FileStream.String;

import java.io.*;

public class String01 {

    public static void main(String[] args) throws IOException {

        char c1 = 'A'; // 2 byte
        char c2 = 'B';

        char x = 65; // A
        char y = 90; // Z


        Writer out = new FileWriter("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/String/test");
        Reader in = new FileReader("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/String/test");


        out.write(c1);
        out.write(c2);
        out.write(x);
        out.write(y);
        out.close();


        char[] cbuf = new char[10]; // 문자 10개 저장하는 문자 배열
        int readCnt;

        readCnt = in.read(cbuf,0,cbuf.length); // 전달된 cbuf 배열에서 0인덱스부터 최대 cbuf 배열의 길이까지 저장하고, 실제 저장한 문자의 수를 반환
        for(int i = 0; i < readCnt; i++)
            System.out.println(cbuf[i]);

        in.close();

    }
}
