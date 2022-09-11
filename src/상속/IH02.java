// 연습 문제 01
package 상속;

class Car{
    int gasolineGauge;
    Car(int gasolineGauge){
        this.gasolineGauge = gasolineGauge;
    }
}

class HybridCar extends Car{
    int electricGauge;
    HybridCar(int gasolineGauge,int electricGauge){
        super(gasolineGauge); // 상위 클래스 생성자 호출
        this.electricGauge = electricGauge;
    }
}
class HybridWaterCar extends HybridCar{
    int waterGauge;
    HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge){
        super(gasolineGauge,electricGauge); // 상위 클래스 생성자 호출
        this.waterGauge = waterGauge;
    }

    public void showData(){ // 잔여량에 대한 데이터를 출력하는 메서드
        System.out.println("잔여 가솔린 : "+gasolineGauge);
        System.out.println("잔여 전기량 : "+electricGauge);
        System.out.println("잔여 워터량 : "+waterGauge);
    }
}

public class IH02 {
    public static void main(String[] args) {
        HybridWaterCar hwc1 = new HybridWaterCar(1,2,3);
        HybridWaterCar hwc2 = new HybridWaterCar(2,3,4);

        hwc1.showData();
        hwc2.showData(); // 데이터 정보 호출
    }
}
