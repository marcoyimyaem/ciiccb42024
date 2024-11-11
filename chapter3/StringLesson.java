package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String name1 = "Marc yim";
        String name2 = "Marc yim";
        String name3 = new String();
        name3="Marc Yim";
        String name4 = "Marc Yim";
        name1 = "Ed Gardo";
        name1=name2;
        name1="Ed Gardo";
        System.out.println("end of program");
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
        //"Ed Gardo"
        System.out.println(name1.toUpperCase());
        name1.toLowerCase();
        System.out.println(name1);
    }
}
