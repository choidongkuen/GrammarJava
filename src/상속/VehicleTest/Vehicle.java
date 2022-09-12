package 상속.VehicleTest;

public class Vehicle {

    public String name; // 차량 이름
    public double maxSpeed; // 최대 속도
    public int maxPassenger; // 최대 정원
    // Vehicle 의 필드(속성)

    public void showInfo(){
        System.out.println("name = " + name);
        System.out.println("maxSpeed = " + maxSpeed);
        System.out.println("maxPassenger = " + maxPassenger);
    }
    // 밑에다가 바로 main 도 가능하지만 오염시키는 것이므로, 따로 vehicleTest 클래스를 만들자


}
