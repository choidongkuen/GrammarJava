// 일반적으로 특정 클래스를 쓰레드로 동작시키기 위해서는 Thread 클래스를 상속해야 하지만, 다중 상속의 문제가 생길 수 있다.
// 이를 위해 Runnable 인터페이스 구현이라는 방법이 존재한다.

package 쓰레드;

class Sum{
    
    private int num; 
    public Sum(){this.num = 0;}
    
    public void addNum(int n){
        this.num += n;
    }
    public int getNum(){
        return this.num;
    }
}

class AdderThread extends Sum implements Runnable{ // Sum 클래스를 상속했음으로, Thread 클래스를 상속 할 수 없음(다중상속 불가)
                                                   // 상속 관계 잘 고려해보기!
    int start,end;
    
    public AdderThread(int s, int e){
        this.start = s;
        this.end = e;
    }
    
    public void run(){ // Thread 의 main 메소드
        for(int i = start; i <= end ; i++){
            addNum(i);
        }
    }
}
public class Th02 {
    public static void main(String[] args) {
        
        AdderThread at01 = new AdderThread(1,50);
        AdderThread at02 = new AdderThread(51,100); // Runnable 인터페이스를 구현하는 클래스의 인스턴스로는 start() 메소드를 구현 할 수 없음
        
        Thread tr1 = new Thread(at01);
        Thread tr2 = new Thread(at02);

        tr1.start();
        tr2.start();

        try{
            tr1.join();
            tr2.join(); // 해당 쓰레드의 실행 종료를 기다릴때까지 코드의 진행을 멈추는 메소드
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("1 ~ 100 합 : " + (at01.getNum() + at02.getNum()));
    }
}
