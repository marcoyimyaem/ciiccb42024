package chapter4;

public class AccessMod {
    public void walk(){
        System.out.println("Walk 1");
    }
    private void walk2(){
        System.out.println("Walk 2");
    }
    protected void walk3(){
        System.out.println("Walk 3");
    }
    void walk4(){
        System.out.println("walk 4");
    }
    public static void main(String[] args) {
        AccessMod am = new AccessMod();
        am.walk();
        am.walk2();
        am.walk3();
    }
}
class OtherClass2{
    public static void main(String[] args) {
        AccessMod am = new AccessMod();
        am.walk();
        // am.walk2();
        am.walk3();
    }
}