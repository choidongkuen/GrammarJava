// LinkedList 구체적 사용

package 컬렉션.리스트;


class GenericBox<T>{ // 제네릭 클래스

    public GenericBox<T> nextBox; // GenericBox 의 참조변수 선언
    T box;

    public void store(T box){
        this.box = box;
    }
    public T pullOut(){
        return this.box;
    }
}

public class Li03 {
    public static void main(String[] args) {

        GenericBox<String> boxHead = new GenericBox<>();
        boxHead.store("First"); // Head 생성

        boxHead.nextBox = new GenericBox<>();
        boxHead.nextBox.store("Second"); // Head 다음 인스턴스(노드) 생성

        boxHead.nextBox.nextBox = new GenericBox<>();
        boxHead.nextBox.nextBox.store("Third"); // Head 다음 다음 인스턴스(노드) 생성

        GenericBox<String> tempRef; // 제네릭 클래스 인스턴스 생성
        tempRef = boxHead.nextBox;
        System.out.println(tempRef.pullOut()); // Second

        tempRef = tempRef.nextBox;
        System.out.println(tempRef.pullOut()); // Third
    }
}
