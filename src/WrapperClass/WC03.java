// 기본형 - > wrapper : Boxing ( 생성자 호출에 의해 )
// wrapper - > 기본형 : Unboxing ( 메소드 호출에 의해 )

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

    }
}
