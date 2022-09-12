package 상속.VehicleTest;

public class VehicleTest {
    public static void main(String[] args) {

        Car c1 = new Car();
        Vehicle v1 = new Vehicle();

        c1.maxSpeed = 100; // vehicle
        c1.maxPassenger = 2; // vehicle
        c1.showInfo();

    }

}
