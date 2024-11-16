import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ProgrammingChallenge.Challenge4;

public class Tester2 {
    @Test
    void oddNumber(){
        Challenge4 c4 = new Challenge4();
        String s = c4.numCheckOorE(5);
        assertEquals("odd",s,"wrong answer");
    }
    @Test
    void evenNumber(){
        Challenge4 c4 = new Challenge4();
        String s = c4.numCheckOorE(12);
        assertEquals("even",s,"wrong answer");
    }
    @Test
    void posNumber(){
        Challenge4 c4 = new Challenge4();
        String s = c4.numCheckPorNZ(10);
        assertEquals("positive",s,"wrong answer");
    }
    @Test
    void negNumber(){
        Challenge4 c4 = new Challenge4();
        String s = c4.numCheckPorNZ(-20);
        assertEquals("negative",s,"wrong answer");
    }
    @Test
    void zeroNumber(){
        Challenge4 c4 = new Challenge4();
        String s = c4.numCheckPorNZ(0);
        assertEquals("zero",s,"wrong answer");
    }
}
