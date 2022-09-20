package 제네릭;

public class Box01<T>{

    public T data;

    public void setBox(T data){
        this.data = data;
    }

    public T getBox(){
        return data;
    }
}

class Test{
    public static void main(String[] args) {
        Box01<Integer> box01 = new Box01<Integer>();
        box01.setBox(new Integer(20));
        box01.setBox(Integer.valueOf(100));

        System.out.println(box01.getBox());
        //...
    }
}