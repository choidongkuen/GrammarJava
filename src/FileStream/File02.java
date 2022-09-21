// 버퍼를 이용해보자

package FileStream;

import java.io.*;

public class File02 {

    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/Test.txt"); // 입력 스트림 셍성
        OutputStream out = new FileOutputStream("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/SubTest02"); // 출력 스트림 생성
        
        int copyByte = 0; // 복사한 데이터 크기
        int readLen;
        byte[] buf = new byte[1024]; // 1KB의 버퍼
        
        while(true){
            
            readLen = in.read(buf); // read 메소드를 통해 배열 buf 에 데이터를 채워넣고 있으며, 채워진 데이터 크기를 변수 readLen에 저장하고 있다.
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
