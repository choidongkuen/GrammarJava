package 인터페이스.Inter01;

public class In01Test {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        s.turnOn();
        s.turnOff();

        s.listen();
        System.out.println("============================");
        LG l = new LG();
        l.turnOn();
        l.turnOff();

        l.call();

    }
}
