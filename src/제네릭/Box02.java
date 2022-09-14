package 제네릭;

public class Box02<T>{

    private T name;
    private T gender; // 두개의 제네릭 변수


    public void setData(T name, T gender){
        this.name = name;
        this.gender = gender;
    }

    public T getData(){return this.name;}

    public T getLastData(){return this.gender;}
}
