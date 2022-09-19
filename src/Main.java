

class Parent{

    protected void print(){
        System.out.println(" 나는 부모입니다. ");
    }
}
public class Main extends Parent{
    public static void main(String[] args) {

    }
    public void printPa(){
        this.print();
        super.print(); // 인스턴스 영
    }
}