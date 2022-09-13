package 매스클래스;

public class SmartMath {
// round 의 반환형은 long

    public static double round(double d1, int n) {
        return ((double)Math.round(d1 * Math.pow(10,n))) / Math.pow(10,n);
        // 12.426 -> 1242.6(d1 * Math.pow(10,2)) -> 1243.0( / Math.round()) ->
        // 12.43( / Math.pow(10,2))
    }

    public static double ceil(double d1, int n) {
        return ((double)Math.ceil(d1 * Math.pow(10,n))) / Math.pow(10,n);
    }

    public static double floor(double d1, int n) {
        return ((double)Math.floor(d1 * Math.pow(10,n))) / Math.pow(10,n);
    }

    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
