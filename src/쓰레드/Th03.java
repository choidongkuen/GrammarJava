// JVM 의 쓰레드 스케쥴러
// 1. 우선순위가 높은 것 부터 실행
// 2. 동일한 우선 순위를 가지는 쓰레드를 실행시, 할당된 CPU의 사용시간을 분배!

package 쓰레드;


class MessageSendingThread extends Thread{

    String message;

    public MessageSendingThread(String str){
        this.message = str;
    }

    public void run(){

        for(int i = 0; i < 100; i++){
            System.out.println(message + "(" + getPriority() +")"); // Thread 클래스의 인스턴스 메소드로 우선순위를 반환한다.( 1 ~ 10 )
        }
    }
}

public class Th03 {
    public static void main(String[] args) {

        MessageSendingThread mst01 = new MessageSendingThread("First");
        MessageSendingThread mst02 = new MessageSendingThread("Second");
        MessageSendingThread mst03 = new MessageSendingThread("Third");

        mst01.start();
        mst02.start();
        mst03.start();
    }
}
