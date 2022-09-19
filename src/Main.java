import java.util.Random;

class Main{
    public static void main(String[] args) {
        Random rand1 = new Random(2);
        Random rand2 = new Random(2);

        System.out.println(rand1.nextInt());
        System.out.println(rand2.nextInt());

        for(int i = 0; i < 10 ; i ++)
            System.out.print(rand1.nextInt()+"  ");
    }
}