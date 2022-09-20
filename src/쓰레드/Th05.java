// 쓰레드는 무리하게 CPU를 독점하려고 하지 않는다.
// 자신이 특정 시간동안은 CPU 할당이 불필요하다면,(ex 입출력) 자신보다 우선순위가 낮은 쓰레드로 CPU 할당을 넘긴다.

// 스케쥴러의 동작 단계 :
// 1. new -> 2. runnable -> 3. blocked -> 4.dead

package 쓰레드;

class MessageSender extends Thread{

    String message;

    public MessageSender(String str, int prio){
        this.message = str;
        setPriority(prio); // 우선순위 설정
    }

    public void run(){

        for(int i = 0; i < 1000; i++){

            System.out.println(this.message + "(" + getPriority() + ")");

            try{
                sleep(1); // 1ms -> 1 / 1000s ( 해당 시간동안은 특정 쓰레드에게 CPU 할당이 불필요하다. 따라서, 우선순위가 낮은 쓰레드에게 넘긴다.)
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Th05 {
    public static void main(String[] args) {

        MessageSender ms01 = new MessageSender("First",Thread.MAX_PRIORITY);
        MessageSender ms02 = new MessageSender("Second",Thread.MIN_PRIORITY); // 쓰레드 생성(아직 JVM에 의해 통제 x)

        ms01.start();
        ms02.start(); // Runnable 한 상태가 된다.
    }
}
