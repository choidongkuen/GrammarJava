package 스트링.StringBufferTest;

class SimpleAdder{

    private int num;
    public SimpleAdder(){this.num = 0;}

    public SimpleAdder add(int num){
        this.num = num;
        return this; // 자기 자신을 return
    } // StringBuilder & StringBuffer는 연속적인 append,insert가 가능!(자기 자신의 참조값으을 return

    public void showResult(){
        System.out.println("add Result = " + this.num);
    }
}

public class SB01 {

    public static void main(String[] args) {
        SimpleAdder sa = new SimpleAdder();
        sa.add(2).add(3).add(4);
        sa.showResult();
    }
}
