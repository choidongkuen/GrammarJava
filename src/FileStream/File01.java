// 입력 스트림이든 출력 스트림이든 항상 1바이트 단위로 데이터가 움직인다.
// 1바이트 단위는 느리다.
package FileStream;

import java.io.*;
public class File01 {

    public static void main(String[] args) throws IOException{ // 입출력 예외 상황을 main 메소드를 호출한 곳(JVM)으로 넘기겠다.

        InputStream in = new FileInputStream("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/Test.txt");
        OutputStream out = new FileOutputStream("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/SubTest.txt"); // 절대 경
        // Test.txt 파일에서 입력을 해서 SubTest 파일에 쓰겠다.

        int copyByte = 0; // 복사된 데이터
        int bData;

        while(true){


            bData = in.read();
            if(bData == -1)
                break; // 더이상 읽어 들여올 데이터가 없음

            out.write(bData); // 읽어 들여올 데이터가 있다면, out 스트림을 통해 데이터를 쓰기
            copyByte ++;
        }

        in.close(); // 입력 스트림 닫기
        out.close(); // 출력 스트림 닫기

        System.out.println("copyByte = " + copyByte);
    }
}
