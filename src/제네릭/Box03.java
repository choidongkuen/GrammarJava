package 제네릭;

public class Box03<K,V> {

    private K name;
    private V age;

    public void setData(K name, V age){
        this.name = name;
        this.age = age;
    }

    public K getName(){
        return this.name;
    }
    public V getAge(){
        return this.age;
    }
}
