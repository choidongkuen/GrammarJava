// 기본형 - > wrapper : Boxing ( 생성자 호출에 의해 )
// wrapper - > 기본형 : Unboxing ( 메소드 호출에 의해 )

// Wrapper Class 의 인스턴스는 String 처럼 값 변경 불가하다.
// ver 5.0 부터 auto 기능 가능

package WrapperClass;

public class WC03 {
    public static void main(String[] args) {
        Integer intInst = new Integer(10); // Boxing
        Double doubleInst = new Double(3.14); // Boxing

        System.out.println(intInst);
        System.out.println(doubleInst);

        int intNum = intInst.intValue() + 10; // Unboxing
        Double doubleNum = doubleInst.doubleValue() + 12.3; // Unboxing

        System.out.println(intNum);
        System.out.println(doubleNum);
        ////////////////////////////////////////////////////////////////

        Integer iValue = 10; // auto-Boxing
        Double dValue = 3.14; // auto-Boxing

        System.out.println(iValue);
        System.out.println(dValue);

        int num1 = iValue; // auto-Unboxing
        double num2 = dValue; // auto-Unboxing

        System.out.println(num1);
        System.out.println(num2);

    }
}
