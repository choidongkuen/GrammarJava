// Wrapper Class 의 인스턴스를 생성하는 방법에는 new 를 사용하는 방식과 static 메소드를 사용하는 방식이 있다.

package WrapperClass;

public class WC05 {
    public static void main(String[] args) {

        Integer iValue1 = new Integer(20); // new 를 이용한 방식
        Integer iValue2 = new Integer(40); // new 를 이용한 방식

        Integer iValue3 = Integer.valueOf(20); // static 메소드 valueOf 를 이용한 방법

        if (iValue1 == iValue2) {
            System.out.println("동일 인스턴스 참조");
        } else {
            System.out.println("다른 인스턴스 참조");
        }

        if (iValue1 == iValue3){
            System.out.println("동일 인스턴스 참조");
        } else{
            System.out.println("다른 인스턴스 참조");
        }
    }
}
