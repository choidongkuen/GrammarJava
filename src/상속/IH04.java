// 상위 클래스의 static 관련 요소들은 어떻게 상속되나요? -> 동일, 심지어 하위 클래스의 클래스명으로도 접근 가능

package 상속;

class Adder{ // 상위 클래스
    public static int val = 0; // static 변수
    public void add(int num){
        val += num;
    }
}

class AdderFriend extends Adder{ // 하위 클래스
    public void friendAdd(int num){
            val += num;
    }

    public void showVal(){
        System.out.println(val);
    }
}

public class IH04 {
    public static void main(String[] args) {
        Adder ad = new Adder();
        AdderFriend af = new AdderFriend();
        ad.add(1);
        af.friendAdd(3);
        af.add(4);

        AdderFriend.val += 10;
        af.showVal();
    }
}
