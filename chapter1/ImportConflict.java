package chapter1;
import java.util.Date;
import otherfolder.A.SampleImport;
import otherfolder.B.*;

public class ImportConflict {
    public String name = "Luffy";
    public static void main(String[] args) {
        Date date;
        java.sql.Date sqldate;
        SampleImport si = new SampleImport();
        System.out.println(si.code);
        Chick c1 = new Chick();
    }
}
