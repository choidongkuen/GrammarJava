// private 변수일 때, 상속의 의미
// private 변수는 클래스 내에서만 사용 가능함으로, 상속의 의미가 없지 않을까? -> No! 의미는 분명히 있다.(간접적 접근)
// 그렇다면 왜 private? : 설계자의 의도 즉, 접근을 막기 위해서(only 안정적인 형태로만 접근 가능)

package 상속;


class Accumulator{
    private int val; // val 값은 Accumulator 클래스 내부에서만 직접적으로 접근 가능 ( 누군가 접근하는 것을 원치 않음 )

    Accumulator(int init){
        this.val = init;
    }
    protected void accumulate(int num){ // 안정적인 접근을 가능하게 함
        if(num < 0)
            return;

        val += num;
    }
    protected int getAccVal(){ // val 값을 얻을 수 있는 메서드
        return val;
    }
}
class SavingAccount extends Accumulator{
    public SavingAccount(int initDep){
        super(initDep); // 상위 클래스의 생성자 호출
    }

    public void saveMoney(int money){ // val 은 private 이기 때문에 상속하는 클래스 내부에서 직접적으로 사용 불가!!
        accumulate(money);
    }
    public void showSavedMoney(){
        System.out.println("지금까지 누적액 : ");
        System.out.println(getAccVal());
    }
}

public class IH03 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(1000); // 인스턴스 생성
        sa.saveMoney(2000);
        sa.saveMoney(1000);
        sa.saveMoney(10000);

        sa.showSavedMoney(); // 결과 호출
    }
}
