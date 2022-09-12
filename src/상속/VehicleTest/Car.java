package 상속.VehicleTest;

public class Car extends Vehicle {
    public String name = "쏘나타"; // 자동차 이름
    public String baegilyang; // 자동차 배기량

    public void showInfo(){
       //super.showInfo(); // 부모의 메서드

        System.out.println("name = "+super.name);
        System.out.println("maxspeed = "+maxSpeed);
        System.out.println("maxPassenger = "+maxPassenger);

        System.out.println("name = " + name);
        System.out.println("baegilyang = " + baegilyang);
    }
}
