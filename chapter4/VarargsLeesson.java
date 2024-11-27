package chapter4;
import java.util.*;    
public class VarargsLeesson {
    static int sumOfAllNumbers(int... numbers){
        return Arrays.stream(numbers).sum();
    }
    public static void main(String[] args) {
        System.out.println(sumOfAllNumbers(1,2,3,4,5,6,7,8,9,10));
    }
    
}
// class Hamster{
//     String name;

//     public Hamster(String name, int age, String color) {
//         this.name = name;
//         this.age = age;
//         this.color = color;
//     }
//     int age;
//     String color;
//     static int numberOfTth = 12;
// }