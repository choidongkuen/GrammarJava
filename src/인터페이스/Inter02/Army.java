package 인터페이스.Inter02;

public class Army implements Solider{

    @Override
    public void hostageRescue() {
        System.out.println("특전사가 인질을 구출합니다.");
    }
    public void walking(){
        System.out.println("특전사가 구보를 합니다.");
    }
    public void IBS(){
        System.out.println("특전사가 IBS를 탑니다.");
    }

}
