// 필터 스트림을 이용하여 원하는 데이터 타입으로 데이터를 읽거나 써보자.
// 필터 입력 스트림, 필터 출력 스트림이 존재한다.

package FileStream;

import java.io.*;
public class File03 {

    public static void main(String[] args) throws IOException {
        OutputStream out  = new FileOutputStream("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/FilterStream.txt"); // FilterStream 파일에 필터 스트림으로 데이터를 쓰기
        DataOutputStream filterOut = new DataOutputStream(out); // out 출력 스트림을 필터 출력 스트림으로 처리

        filterOut.writeInt(275); // int 형으로 데이터를 출력
        filterOut.writeDouble(45.79); // double 형으로 데이터를 출력
        filterOut.close(); // 필터 출력 스트림 해제


        InputStream in = new FileInputStream("/Users/DongKuen/Desktop/GitHub/GrammarJava/GrammarJava/src/FileStream/FilterStream.txt"); // FilterStream 파일로 부터 필터 스트림을 이용해서 데이터 얻어오기
        DataInputStream filterIn = new DataInputStream(in); // in 입력 스트림을 필터 입력 스트림으로 처리

        int num1 = filterIn.readInt(); // int 형으로 데이터를 입력
        double num2 = filterIn.readDouble(); // double 형으로 데이터를 입력
        filterIn.close();

        System.out.println(num1);
        System.out.println(num2);
    }
}
