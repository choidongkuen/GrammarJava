// HashSet 컬렉션 클래스의 원리 :
// 항상 특정 객체를 add 하기 전, 이미 해당 객체가 있나 확인하는 '검색' 과정이 동반된다.
// 해시 원리를 이용하면 매우 빠른 검색을 할 수 있고, 이는 매우 빠른 데이터의 저장이 될 수 있다.
// 검색 1 ) : Object 클래스의 hashCode() 메소드를 통하여 해시값을 구함
// 검색 2 ) : Object 클래스의 equals() 메소드를 통하여 동일한 해시값을 가진 객체가 있나 확인

package 컬렉션.세트;


import com.sun.net.httpserver.SimpleFileServer;

import java.util.HashSet;
import java.util.Iterator;

class SimplerNumber{

    int num;

    public SimplerNumber(int num){
        this.num = num;
    }

    public String toString(){
        return Integer.toString(this.num);
    }

    public int hashCode(){
        return this.num % 3; // hash function
    } // Object 클래스의 hashCode() 메소드 오버리이딩

    public boolean equals(Object obj){
        if(this.num == ((SimplerNumber)obj).num) // num 기준으로 판단
            return true;
        return false;
    }
}

public class Set03 {
    public static void main(String[] args) {

        HashSet<SimplerNumber> hashSet = new HashSet<>();

        hashSet.add(new SimplerNumber(20));
        hashSet.add(new SimplerNumber(20)); // 저장 x
        hashSet.add(new SimplerNumber(20)); // 저장 x
        hashSet.add(new SimplerNumber(30));
        hashSet.add(new SimplerNumber(30)); // 저장 x
        hashSet.add(new SimplerNumber(40));

        System.out.println("hashSet.size() = " + hashSet.size());

        
        Iterator<SimplerNumber> itr = hashSet.iterator();
        while(itr.hasNext())
            System.out.println("itr.next() = " + itr.next());
    }
}
