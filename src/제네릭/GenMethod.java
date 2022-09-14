package 제네릭;

public class GenMethod {

    /*
    public void print(String[] item){
        for(String s : item)
            System.out.println(s);
    }

    public void print(double[] item){
        for(double d : item)
            System.out.println(d);
    }
    */

    public static <E> void print(E[] item){ // 제네릭 메소드는 반환형 앞에 <T>
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }

    public static <E> E getLastItem(E[] item){ // 제네릭 메소드 + 반환형도 제네릭
        return item[item.length - 1];
    }
}
