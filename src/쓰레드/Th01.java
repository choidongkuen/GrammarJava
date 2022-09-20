// 모든 프로그램은 실행시 OS 에 의해 메모리를 할당받는다.
// 물리메모리(Ram) 에 올라간 프로그램을 '프로세스' 라고 한다.
// 하나의 프로세스에는 하나 이상의 쓰레드(프로그램의 흐름)이 존재한다.
// 자바는 쓰레드를 컨트롤 할 수 있다.

package 쓰레드;

class ThreadShower extends Thread{ // Thread 클래스를 상속(자바에서는 Thread 조차도 인스턴스 취급)

    public ThreadShower(String name){
        super(name); // 상위 클래스인 Thread 클래스에 < public Thread(name) 정의 >
    }
    public void run(){ // thread 만의 main 메소드(Thread 클래스의 run 메소드를 오버라이딩 한 것)

        for(int i = 0; i < 100; i++){
            System.out.println("안녕하세요. " + this.getName() + " 입니다.");

            try{
                sleep(100); // ms 기준
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Th01 {
    public static void main(String[] args) {

        ThreadShower ts01 = new ThreadShower("쓰레드01");
        ThreadShower ts02 = new ThreadShower("쓰레드02"); // ts01 과 ts02 는 별도의 프로그램 흐름을 형성!

        ts01.start();
        ts02.start(); // 쓰레딩 시작!
    }
}
