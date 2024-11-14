package ProgrammingChallenge;

    
public class PalindromeString {
    public String checkPalindrome(String word){
        String revString = "";
        for(int y = word.length()-1;y>=0;y--){
            revString+=word.charAt(y);

        }
        System.out.println(revString);
        return (revString.equals(word))?"Palindrome":"not Palindrome"; 
    }
    public static void main(String[] args) {
        PalindromeString ps = new PalindromeString();
        System.out.println(ps.checkPalindrome("level"));
    }
    //level
    //l
    //le
    //lev
    //leve

    //levels
    //s
    //sl
    //sle
    //slev
    //sleve
    //slevel
    
    
}
