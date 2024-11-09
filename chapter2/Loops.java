package chapter2;
public class Loops {
    public static void main(String[] args) {
        int x = 0;
        while(x<10){
            System.out.println(x++);
            System.out.println("hello");
        }
        System.out.println("world");
        do
            System.out.println(x--);
        while (x>0);

    }
}
