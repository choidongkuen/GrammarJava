package 예외;

import java.lang.reflect.Array;

public class EX04 {
    public static void main(String[] args) { // 예외 상황이 발생할 여지가 있는 영역
        try{
            int[] arr = new int[3];
            arr[-1] = 20; // 배열에 해당 인덱스로 접근 불가

        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Error occurs!");
            System.out.println(e.getMessage());
        }
        try{
            Object obj = new int[10];
            String str = (String)obj; // 형변환 불가 ( 컴파일 에러 )
        } catch(ClassCastException e){

            System.out.println(e.getMessage());
        }

        try{
            int[] arr = new int[-10];
        }catch(NegativeArraySizeException e){ // 배열의 사이즈가 음수
            System.out.println(e.getMessage());
        }

        try{
            String str = null;
            int len = str.length(); // 인스턴스가 null 인데, 메소드 호출
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
