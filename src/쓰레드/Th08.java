package 쓰레드;


class Calculator{

    int opCnt = 0;
    public synchronized int add(int n1, int n2){
        this.opCnt++;
        return n1 + n2;
    }
    public synchronized int min(int n1, int n2){
        this.opCnt++;
        return n1 - n2;
    }
    // int add(int n1, int n2) , int min(int n1, int n2) 두 메소드는 opCnt에 접근하는 메소드이며, 각기 다른 쓰레드에 의해 동시에 호출되면 안된다! -> '동기화 메소드' 처리
    public int getOpCnt(){
        return this.opCnt;
    }
}
class AddThread extends Thread{ // AddThread

    Calculator cal; // 각 쓰레드가 동일한 인스턴스를 공유한다.
    public AddThread(Calculator cal){
        this.cal = cal;
    }

    public void run(){
        System.out.println("1 + 2 = " + cal.add(1,2));
        System.out.println("2 + 4 = " + cal.add(2,4));
    }
}
class MinThread extends Thread{ // MinThread

    Calculator cal;
    public MinThread(Calculator cal){
        this.cal = cal;
    }

    public void run(){
        System.out.println("2 - 1 = " + cal.min(2,1));
        System.out.println("4 - 2 = " + cal.min(4,2));
    }
}
public class Th08 {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        AddThread at = new AddThread(cal); // 덧셈을 실행하는 쓰레드
        MinThread mt = new MinThread(cal); // 뺄셈을 실행하는 쓰레드

        at.start();
        mt.start(); // 쓰레드 시작!

        // 동기화 메소드를 사용하지만 실질적인 동기화의 주체는 인스턴스이다. 따라서, 동기화 영역은 인스턴스 전체로 확장된다.
        // 가령, at 쓰레드가 runnable 상태에 있다면 Calculator 인스턴스의 열쇠를 가지게 되는 것(mt 는 사용 불가!)

        try{
            at.join();
            mt.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("총 연산 횟수: " + cal.getOpCnt()); // 총 opCnt 값 출력
    }
}
