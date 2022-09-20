// <? extends classA> -> classA 혹은 classA를 상속하는 모든 클래스가 매게변수 타입이 될 수 있음
// 참고 : <? super classB> -> classB 혹은 classB가 상속하는 모든 클래스가 매게변수 타입이 될 수 있음
// 와일드 카드 : 이름 또는 문자열에 제한을 가하지 않음을 명시하는 용도로 사용되는 특별 기호

package 제네릭;

class Fruit{
    public void showYou(){
        System.out.println("I am a Fruit");
    }
}

class Apple extends Fruit{

    public void showYou(){
        super.showYou(); // 상위 클래스의 메소드 호출
        System.out.println("I am a red Fruit");
    }

}

// Fruit <- Apple

class FruitBoxTest<T>{ // 제네릭 클래스

    T item;

    public void store(T item){
        this.item = item;
    }
    public T pullOut(){
        return this.item;
    }
}

public class Gen09 {

    public static void openAndShowFruitBox(FruitBoxTest<? extends Fruit> box){ // FruitBoxTest 클래스 형 box  << 그러나, FruitBoxTest 에 올 수 있는 자료형은 Fruit or Fruit 를 상속하는 클래스형 >>

        Fruit fruit = box.pullOut(); // box 는 Fruit 혹은 Fruit 을 상속하는 클래스형을 처리하는 클래스 이다.
        fruit.showYou();

    }
    public static void main(String[] args) {

        FruitBoxTest<Fruit> box1 = new FruitBoxTest<>();
        box1.store(new Fruit());

        FruitBoxTest<Apple> box2 = new FruitBoxTest<>();
        box2.store(new Apple());

        openAndShowFruitBox(box1);
        openAndShowFruitBox(box2);


    }
}
