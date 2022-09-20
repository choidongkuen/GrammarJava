// 각 쓰레드는 힙,코드,데이터 영역을 공유하지만, 각자의 흐름을 유지하기 위헤 스택은 각각 가진다.
// 쓰레드간 통신이 필요한 경우, 힙영역을 이용하여 교신한다.

package 쓰레드;

class SumMachine{
    int num;

    public SumMachine(){this.num = 0;}
    public void addNum(int n){this.num += n;}
    public int getNum(){return this.num;}
}

class AdderThreadTest extends Thread{ // 해당 클래스를 Thread 이용해서 실행시키겠다.
    SumMachine sumInst; // Sum 인스턴스의 참조변수
    int start,end;

    public AdderThreadTest(SumMachine sum, int s, int e){
        sumInst = sum;

        this.start = s;
        this.end = e;
    }

    public void run(){

        for(int i = start ; i <= end; i++)
            sumInst.addNum(i); // SumMachine의 addNum 메소드
    }
}

public class Th06 {
    public static void main(String[] args) {

        SumMachine s = new SumMachine();

        AdderThreadTest att01 = new AdderThreadTest(s,1,50);
        AdderThreadTest att02 = new AdderThreadTest(s,51,100); // 동일한 참조변수의 참조값을 인자로 전달

        att01.start();
        att02.start(); // 두 인스턴스는 해당 클래스 내부에 존재하는 sumInst 참조 변수에 접근 가능

        try{
            att01.join();
            att02.join();
        } // 위에 존재하는 쓰레드가 종료될 때까지 기다리겠다.
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("1 ~ 100 까지 합 : " + s.getNum());
    }
}
