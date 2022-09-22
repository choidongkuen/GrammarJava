// Java8 부터는 Lambda를 이용한 정렬 가능

package 컬렉션.정렬;

import java.util.Arrays;

class Kids{ // Comparable 인터페이스 구현 필요 x
    
    int age; 
    double weight;
    int height;
    
    public Kids(int age, double weight, int height){
        this.age = age; 
        this.weight = weight;
        this.height = height;
    }
    
    public String toString(){
        return this.age +" "+this.weight+" "+this.height;
    }
    
    /*
    public int compareTo(Kids k){
        return (int)k.weight - (int)this.weight; // 무게 기준 내림차순 정렬
    }*/
}
public class Comparable03 {

    public static void main(String[] args) {
        
        Kids[] kids = new Kids[3];
        
        kids[0] = new Kids(2,10.2,100);
        kids[1] = new Kids(1,7.8,102);
        kids[2] = new Kids(3,11,104);
        
        Arrays.sort(kids,(x,y) -> (int)x.weight - (int)y.weight); // (매개변수1, 배개변수2) -> 함수

        for (int i = 0; i < kids.length; i++) {
            System.out.println("kids[i] = " + kids[i]);
        }
    }
}
