// instanceof => 피연산자1 instance of 피연산자2 // 피연산자1 객체 변수가 피연산자2로 형변환이 가능한지 체크하는 연산자

package 상속.다형성.인스턴스오브연산자;

public class FruitTest {

    public static void checkInstance(Fruit fruit) {
        if (fruit instanceof Banana)
            System.out.println("바나나 입니다.");
        else if (fruit instanceof Apple)
            System.out.println("사과 입니다.");
        else if (fruit instanceof Pear)
            System.out.println("배 입니다.");
        else
            System.out.println("아무것도 아닙니다.");
    }



    public static void main(String[] args) {
        Fruit f = new Fruit();

        Fruit apple = new Apple(); // 업캐스팅
        Fruit banana = new Banana(); // 업캐스팅
        Fruit pear = new Pear(); // 업캐스팅

        checkInstance(f);
        checkInstance(apple);
        checkInstance(banana);
        checkInstance(pear);
    }
}
