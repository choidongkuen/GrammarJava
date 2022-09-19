// finally 영역은 예외상황의 발생여부와 상관없이 항상 실행되는 영역이다.
// 즉 finally 는 try 영역으로 일단 들어가면 무조건 실행되는 영역이다.

package 예외;


public class EX06 {
    public static void main(String[] args) {

        boolean divOk = divider(4,2);
        if(divOk)
            System.out.println("연산 성공");
        else
            System.out.println("연산 실패");

        divOk = divider(4,0);

        if(divOk)
            System.out.println("연산 성공");
        else
            System.out.println("연산 실패");
    }
    public static boolean divider(int x, int y){

        try{
            int result = x / y; // 예외상황 발생 여지 있는 부분

            System.out.println("나눗셈 결과 : " + result);
            return true;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return false;
        }finally {
            System.out.println("finally 영역 실행");
        }
    }
}
