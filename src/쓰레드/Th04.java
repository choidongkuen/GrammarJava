// 우선순위를 설정하지 않으면 중간 우선 순위인 5을 갖는다.
// 우선순위 설정 가능

package 쓰레드;

class MessageSendingThreadTest extends Thread{

    String message;

    public MessageSendingThreadTest(String str,int prio){
        this.message = str;
        setPriority(prio); // 해당 쓰레드의 Priority 설정
    }

    public void run(){

        for(int i = 0; i < 10000; i ++)
            System.out.println(message + "(" + getPriority() + ")");
    }
}

public class Th04 {

    public static void main(String[] args) {

        MessageSendingThreadTest mstt01 = new MessageSendingThreadTest("First",Thread.MAX_PRIORITY); // 10
        MessageSendingThreadTest mstt02 = new MessageSendingThreadTest("Second",Thread.NORM_PRIORITY); // 5
        MessageSendingThreadTest mstt03 = new MessageSendingThreadTest("Third",Thread.MIN_PRIORITY); // 1

        mstt01.start();
        mstt02.start();
        mstt03.start();
    }
}
