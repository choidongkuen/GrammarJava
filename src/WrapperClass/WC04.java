// auto-Boxing & auto-Unboxing 적용

package WrapperClass;

public class WC04 {
    public static void main(String[] args) {

        Integer num1 = 10;
        Integer num2 = 20;

        num1 ++; // auto-unboxing 후 증가 & auto-unboxing - > num1 = new Integer(num1.intValue() + 1))
        System.out.println(num1); // 출력 11


        num2 += 3; // 위와 동일
        System.out.println(num2); // 23

        int addResult = num1 + num2; // 34
        System.out.println(addResult);

    }
}
