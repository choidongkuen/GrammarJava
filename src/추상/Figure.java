package 추상;

public abstract class Figure {
    protected int x;
    protected int y;

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract void draw(); // 추상 메서드

}
