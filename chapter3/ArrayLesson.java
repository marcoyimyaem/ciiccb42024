package chapter3;

import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        int[] ids = {1,2,3};
        int ids2[]= new int[4], type =5;
        Bubu[] bubus = {new Bubu(),new Bubu()};
        System.out.println();
        String[] colors = {"white","red","pink","green"};
        for(String color:colors )
            System.out.println("color:"+color);
        int[] nums = {4,2,7,5,9,6,3,67,7,3,6,3,7,3};        
        Arrays.sort(nums);
        
        for(int num:nums )
            System.out.print(num+",");
        int[] nums2 = {4,2,7,5,9,6,3,67};    
        System.out.println();    
        Arrays.sort(nums2);
        for(int num:nums2 )
            System.out.print(num+",");
        System.out.println("Binary Search:"+Arrays.binarySearch(nums2, 8));
    }
    
}
class Bubu{
    String name;
    String color;
    public static void main(String[] args) {
        Bubu b1 = new Bubu();
        b1.name ="Gar";
        b1.color = "White";
        System.out.println("Bubu info:\n"+b1.name+" with a color: "+b1.color);
    }
}
