// equals 메소드는 객체의 참조값을 비교한다.
package 오브젝트;

class IntNumber{
    int num;

    public IntNumber(int num){
        this.num = num;
    }

    public boolean equals(Object numObj){ // 업캐스팅
        if(this.num == ((IntNumber)numObj).num)
            return true;
        return false;
    } // 메소드 오버라이딩(선언부는 모두 동일해야 함)
}
public class Object02 {
    public static void main(String[] args) {
        IntNumber num1 = new IntNumber(1);
        IntNumber num2 = new IntNumber(2);
        IntNumber num3 = new IntNumber(3);

        if(num1.equals(num2))
            System.out.println("num1 과 num2는 동일한 정수이다.");
        else
            System.out.println("num1 과 num2는 다른 정수이다.");
        if(num2.equals(num3))
            System.out.println("num2 와 num3는 동일한 정수이다.");
        else
            System.out.println("num2 와 num3는 다른 정수이다.");
    }
}
