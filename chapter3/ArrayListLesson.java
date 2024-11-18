package chapter3;
import java.util.*;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add("String");
        list2.add("String2");
        list2.add("String3");
        list2.add("String4");
        list2.add(true);
        ArrayList list3 = new ArrayList<>(list2);
        list3.add(0,"String5");
        list3.add(2);
        System.out.println((boolean)list2.get(4) == false); //list2[4]
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list3.remove(0)+" is deleted");
        System.out.println(list3.remove(true));
        System.out.println(list3.remove(2));
        // System.out.println(list3.remove("String5"));
        System.out.println(list3);
        System.out.println(list3.set(0,"Hello"));
        System.out.println(list3);
        list3.clear();
        System.out.println(list3);
        Integer x =10;
        System.out.println(x.compareTo(100));
        System.out.println(Integer.max(0, 0));
        List<String> list4 = Arrays.asList("list1","list2","list3","list4","list5"); 
        System.out.println(list4);
        // list4.clear();
        System.out.println(list4);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(3);
        numbers.add(81);
        numbers.add(51);
        numbers.add(75);
        Collections.sort(numbers);
        // Collections.reverse(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);

    }
}
