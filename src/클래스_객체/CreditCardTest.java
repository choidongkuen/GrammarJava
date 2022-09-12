package 클래스_객체;

public class CreditCardTest {
    public static void main(String[] args) {

        CreditCard myCard = new CreditCard(); // 객체 생성
        myCard.setCardNumber(1111_2222_3333_4444L);
        myCard.cardOwner = "Choi";

        // 누적 포인트와, 카드 사용 누적 금액은 인스턴스 변수임으로 자동 초기화

        // 카드 사용
        myCard.use(200000);
        myCard.use(2000);
        myCard.use(5600);

        // 카드 대금 결제
        myCard.payBill(200000);
        myCard.payBill(2000);

        // 포인트 지금
        // myCard.addPoint();  -> 불가

        // 출력
        System.out.println(myCard.getCardNumber()); // 카드 번호
        System.out.println(myCard.cardOwner); // 소유주
        System.out.println(myCard.point); // 포인트
        System.out.println(myCard.getCardNumber()); // 누적 금액
    }
}
