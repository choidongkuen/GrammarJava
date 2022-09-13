package 상속.다형성.인스턴스오브연산자;


import org.w3c.dom.ls.LSOutput;

public class Fruit {
    public static void main(String[] args) {
        System.out.println("과일입니다.");
    }
}

class Apple extends Fruit{
    public void showData(){
        System.out.println("사과입니다.");
    }
}

class Pear extends Fruit{
    public void showData(){
        System.out.println("배입니다.");
    }
}

class Banana extends Fruit{
    public void showData(){
        System.out.println("바나나입니다.");
    }
}