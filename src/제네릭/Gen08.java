package 제네릭;


public class Gen08 {

    public static <T extends SimpleInterface> void showInstanceAncestor(T param){
        param.showYourName();
    }

    public static <T extends UpperClass> void showYourName(T param){
        param.showYourAncestor();
    }
    public static void main(String[] args) {

        AA aa = new AA();
        BB bb = new BB();

        showInstanceAncestor(aa);
        showYourName(aa);
        //////////////////////////
        showInstanceAncestor(bb);
        showYourName(bb);
    }
}

// 해당 제네릭 메소드에 맞지 않는 타입 매개변수가 오는 경우, 컴파일 에러를 발생시킨다 -> 안전성 보장
