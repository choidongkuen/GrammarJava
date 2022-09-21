// 필터 스트림 중, 사용빈도가 높은 BufferedInputStream과 BufferedOutputStream을 살펴보자
// 버퍼기능(빠른 전송 속도) + 필터 기능(사용자 정의) = 버퍼 필터 스트림
// 버퍼의 크기를 지정하지 않으면 2MB 이다.
// 파일과 자바 프로그램의 거리는 매우 멀다(하드 디스크(SSD) 와 메모리의 거리)

// BufferedOutputStream 의 write 메소드는 버퍼가 다 차야 하드 디스크로 데이터를 보냄으로, 중간에 컴퓨터 전원이 나가면 정상적으로 write 되어지지 않을 수도 있다.
// 따라서 flush 메소드를 이용하자.(버퍼가 꽉 차지 않아도, 파일로 전송) -> 충분히 close() 로 해결가능 # 빈번한 flush 메소드 호출은 버퍼의 이점을 상쇄!

package FileStream.File;

import java.io.*;

public class File04{
    public static void main(String[] args) throws IOException {

        InputStream in =  new FileInputStream("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/Test.txt");
        OutputStream out = new FileOutputStream("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/SubTest.txt");

        BufferedInputStream bufferedIn = new BufferedInputStream(in,20);
        BufferedOutputStream bufferedOut = new BufferedOutputStream(out,20); // 버퍼의 사이즈 지정
        // 기본적인 필터 스트림 생성하는 방법과 동일

        int copyByte = 0;
        int bData; // byte 단위로 이동

        while(true){

            bData = bufferedIn.read(); // 데이터를 읽어드림
            if(bData == -1)
                break;

            bufferedOut.write(bData); // 데이터를 씀
            copyByte ++; // 복사한 데이터 크기 증가
        }

        bufferedIn.close();
        bufferedOut.close();
        System.out.println("copyByte = " + copyByte);
    }
}
