// 버퍼를 이용해보자

package FileStream;

import java.io.*;

public class File02 {

    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/Test.txt");
        OutputStream out = new FileOutputStream("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/SubTest02");
        
        int copyByte = 0; // 복사한 데이터 크기
        int readLen;
        byte[] buf = new byte[1024]; // 1KB
        
        while(true){
            
            readLen = in.read(buf); // buf 크기만큼 데이터를 읽겠다.
            if(readLen == -1){
                break;
            }
            
            out.write(buf,0,readLen); // buf 배열을 대상으로 0번 인덱스의 위치서부터 시작해서 readLen 바이트를 출력 스트림을 통해서 전송하는 메소드
            copyByte += readLen;
        }
        
        in.close();
        out.close();

        System.out.println("copyByte = " + copyByte);
    }
}
