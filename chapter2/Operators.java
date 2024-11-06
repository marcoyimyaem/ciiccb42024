package chapter2;

public class Operators {
    public static void main(String[] args) {
        int y = 10;
        System.out.println(--y);
        // System.out.println(y);
        System.out.println( y + 10 + +y++);
        System.out.println(+13%+10);

        System.out.println(5<<1);
        System.out.println(1>>1);
        // 8 4 2 1
        // 0 1 0 1
        // 1 0 1 0
        // 0001
        // 1000
    }
}
