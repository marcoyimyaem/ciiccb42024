package chapter2;
public class Loops {
    static void looperMsg(){
        System.out.println("Looper");
    }
    static boolean check(){
        return true;
    }
    static void printNum(int x){
        if(x<10){
            System.out.println("printnum "+x);
            printNum(++x);
        }

        
    }
    static String fobar(int c){
        return (c%5==0) ? ((c%3==0) ? "foobar":"bar" ): (c%3==0) ? "foo":"not for nor bar";
    }
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
        int y = 0;
        long t=0;
        for(  ;y<10; t++ )
            System.out.println("y="+ y++);
        //for(;;)
        printNum(1);
        for(int a=1;a<=9;a++) {
            for(int b=0;b<a;b++)
                System.out.print(a);
            System.out.println();

        }
        System.out.println("Menu of the day:");
        String ulams[] = {"Sisig","Lechon","Monok","Kwek Kwek","NACL"};
ULAM_LOOP:        for(String ulam : ulams){
            if(ulam=="Sisig"){
                break ULAM_LOOP;
            }
            System.out.println(ulam);
        }
        System.out.println();
        int check_number = 10;
        String message;
        for(int i =0; i<=check_number;i++){
            message = (i%2==0) ? "even":"odd";
            
            System.out.println(i+" is an "+message+" number");
        }
    System.out.println(fobar(11));
    }
    
}
