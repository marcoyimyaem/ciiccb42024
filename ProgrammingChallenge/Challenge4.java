package ProgrammingChallenge;

public class Challenge4 {
    public String numCheckOorE(int number){
        
        return (number%2==0)?"even":"odd";
    }
    
    public String numCheckPorNZ(int number){
        return (number==0)?"zero":
            (number>0)?"positive":"negative";
    }
    public static void main(String[] args) {
        Challenge4 c4 = new Challenge4();
        c4.numCheckOorE(0);
        
    }
    
}
