package 제네릭;

class FruitOrange{

    int sugarContent;
    int price; // 가격

    public FruitOrange(int sugar,int price){
        this.sugarContent = sugar;
        this.price = price;
    }
    public void showData(){
        System.out.println("오렌지가 함유하는 당분 함량 : " + this.sugarContent);
        System.out.println("오렌지의 가격은 : " + this.price);
        System.out.println("===========================================");
    }
}

class FruitApple{

    int sugarContent;
    int weight; // 무게

    public FruitApple(int sugar, int weight){
        this.sugarContent = sugar;
        this.weight = weight;
    }

    public void showData(){
        System.out.println("사과가 함유하는 당분 함량 : " + this.sugarContent);
        System.out.println("사과의 무게는 : " + this.weight);
        System.out.println("===========================================");

    }
}

class FruitBanana{

    int sugarContent;
    String color;

    public FruitBanana(int sugar, String color){
        this.sugarContent = sugar;
        this.color = color;
    }

    public void showData(){
        System.out.println("바바나가 함유하는 당분 함량 : " + this.sugarContent);
        System.out.println("바나나의 색깔은 : " + this.color);
        System.out.println("===========================================");

    }
}
class FruitStoreBox<T> {
    T item;

    public void store(T item){
        this.item = item;
    }

    public T pullOut(){
        return this.item;
    }

}
public class GenericBaseFruitBox{

    public static void main(String[] args) {

        FruitStoreBox<FruitOrange> orangeBox = new FruitStoreBox<>(); // 오렌지 박스

        orangeBox.store(new FruitOrange(20,1000));
        FruitOrange org1 = orangeBox.pullOut();
        org1.showData();


        FruitStoreBox<FruitApple> appleBox = new FruitStoreBox<>(); // 사과 박스

        appleBox.store(new FruitApple(10,2));
        FruitApple app1 = appleBox.pullOut();
        app1.showData();


        FruitStoreBox<FruitBanana> bananaBox = new FruitStoreBox<>(); // 바나나 박스
        bananaBox.store(new FruitBanana(5,"Yellow"));
        FruitBanana ban1 = bananaBox.pullOut();
        ban1.showData();
    }
}

// 안전성 보장 및 다양한 형태의 자료형 사용 가능!!
