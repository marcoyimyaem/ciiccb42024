import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ProgrammingChallenge.PalindromeString;
public class Tester {
    @Test
    void PalindromerValid(){
        PalindromeString ps = new PalindromeString();
        String ss =ps.checkPalindrome("level");
        assertEquals("Palindrome",ss,"invalid");
    }
    @Test
    void PalindromerInvalid(){
        PalindromeString ps = new PalindromeString();
        String ss =ps.checkPalindrome("levels");
        assertEquals("not Palindrome",ss,"invalid");
    }
    @Test
    void addTwonumbers(){
        assertEquals(5,(4+1),"incorrect computation");
    }
}
