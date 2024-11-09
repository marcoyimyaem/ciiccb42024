package chapter2;

public class ConditionalStatements {
    public static void main(String[] args) {
        int hour = 4;
        if(hour>5)
            System.out.println("Good Morning");
        System.out.println("welcome to Java nc III");
        

        int option = 1;
        switch(option){
            
            case 1: System.out.println("option 1"); break;
            default: System.out.println("invalid option"); break;
            case 2: System.out.println("option 2"); break;
            case 3: System.out.println("option 3"); break;
            
        }
    }    
}
