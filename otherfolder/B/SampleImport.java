package otherfolder.B;
import chapter4.AccessMod;
public class SampleImport extends AccessMod {
    public static void main(String[] args) {
        AccessMod am = new AccessMod();
        am.walk();
        // am.walk3(); 
        SampleImport si = new SampleImport();
        si.walk();
        // si.walk2();
        si.walk3();
    }
}
