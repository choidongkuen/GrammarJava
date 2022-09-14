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
