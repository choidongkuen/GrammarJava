// 동기화의 중요성을 알 수 있는 예제
// 답 : 300000000
// 나오는 답 : 각기 다름(동기화 이슈)

// 해결책01 : 동기화 메소드
// 해결책02 : 동기화 블록 지정

package 쓰레드;
class Increment{

    private int num = 0;

    public /*synchronized*/ void increment(){num ++;}
    public int getNum(){return this.num;}
}

class IncThread extends Thread{

    Increment increInst;

    public IncThread(Increment inc){
        this.increInst = inc;
    }

    public void run() {

        for (int i = 0; i < 10000; i++)
            for (int j = 0; j < 10000; j++)
                increInst.increment(); // 1 씩 증가
    }
}
public class Th07 {

    public static void main(String[] args) {

        Increment incInst = new Increment();

        IncThread it01 = new IncThread(incInst);
        IncThread it02 = new IncThread(incInst);
        IncThread it03 = new IncThread(incInst); // 각 쓰레드가 하나의 인스턴스(힙)를 공유


        it01.start();
        it02.start();
        it03.start();

        try{
            it01.join();
            it02.join();
            it03.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(incInst.getNum());
    }
}
