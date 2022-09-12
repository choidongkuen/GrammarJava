// 신용카드 작동 원리 구현해보기
package 클래스_객체;

public class CreditCard{
    private long cardNumber; // 카드 번호
    public String cardOwner; // 소유주

    private long balance; // 카드사용 누적 금액
    public long point; // 누적 포인트

    public void setCardNumber(long cardNumber){

        if(cardNumber < 1000_0000_0000_0000L)
            System.err.println("cardNumber has an error");
        this.cardNumber = cardNumber;
    } // cardNumber setter

    public long getCardNumber(){
        return this.cardNumber;
    } // cardNumber getter

    public void setBalance(long point){
        if(point < 0)
            System.err.println("Poiny has an error");
        this.point = point;
    } // balance setter

    public long getBalance(){
        return this.balance;
    } // balance getter

    //

    public void use(long amount){
        balance += amount; // amount 양의 금액을 결제했음으로, 누적금액 증가
    }

    public void payBill(long amount){
        balance -= amount; // amount 만큼 금액을 갚았음으로, 누적금액 감소
        double addedPoint = amount * 0.01; // 결제 한 금액
        addPoint((long)addedPoint); // 포인트 적립
    }

    private void addPoint(long point){
        this.point += point; // amount 만큼 포인트 적립, 내부에서만 작동함으로, private 선언
    }
}
