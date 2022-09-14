// 예외 처리 방법 1. 내가 직접 try & catch
// 예외 처리 방법 2. 넘긴다(throw)

package 예외;

public class Ex01 {
    public static void main(String[] args) {

        try {
            Class.forName("abc"); // 클래스 이름 찾는 메소드
        } catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("오류 발생하면 처리!");
        }
    }
}
