// hash

package 컬렉션.세트;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber{
    int num;

    public SimpleNumber(int num){
        this.num = num;
    }
    public String toString(){
        return String.valueOf(num); // num 을 문자열로 반환
    }
}

public class Set02 {
    public static void main(String[] args) {

        HashSet<SimpleNumber> hashSet = new HashSet<>();

        hashSet.add(new SimpleNumber(20));
        hashSet.add(new SimpleNumber(30));
        hashSet.add(new SimpleNumber(40));

        System.out.println("저장된 데이터 수 : " + hashSet.size());

        Iterator<SimpleNumber> itr = hashSet.iterator();

        while(itr.hasNext()){
            System.out.println("itr.next() = " + itr.next());
        }
    }
}
