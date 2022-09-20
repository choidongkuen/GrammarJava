// Th08 에서 다룬 동기화 메소드는 특정 동기화가 필요한 문장 때문에 전체 메소드가 완료될때 까지 기다려야 한다는 단점이 있다.
// 이는 곧 성능 저하를 초래한다.

package 쓰레드;

class IHaveTwoNum{

    int num1 = 0;
    int num2 = 0;

    public void addOneNum1(){this.num1 += 1;} // num1 += 1
    public void addTwoNum2(){this.num2 += 2;} // num2 += 2

    public void addOneNum2(){this.num2 += 1;} // num2 += 1
    public void addTwoNum1(){this.num1 += 2;} // num1 += 2

    // 각 메소드가 각 변수에 동시 접근 -> 동기화 필요!
    // 그러나 4개의 모든 메소드를 동기화 메소드로 만든느 것은 '지나치게' 동기화 한 것

    public void showAllNums(){
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    } // 숫자 상태를 출력하는 메소드
}

class AccessThread extends Thread{

    IHaveTwoNum itn;

    public AccessThread(IHaveTwoNum itn){
        this.itn = itn;
    }

    public void run(){
        itn.addOneNum1();
        itn.addTwoNum1();

        itn.addOneNum2();
        itn.addTwoNum2();
    }
}

public class Th09 {

    public static void main(String[] args) {

        IHaveTwoNum itn = new IHaveTwoNum();

        AccessThread at01 = new AccessThread(itn);
        AccessThread at02 = new AccessThread(itn);

        at01.start();
        at02.start();

        try{

            at01.join();
            at02.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        itn.showAllNums();
    }

}
