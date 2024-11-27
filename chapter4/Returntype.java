package chapter4;
import java.util.*;
public class Returntype {
    void getEmployees(){
        ArrayList<Employees> employees= new ArrayList<>();
        employees.add(new Employees("Marco",19000)); 
        employees.add(new Employees("Marco",19000)); 
        employees.add(new Employees("Marco",19000)); 
        System.out.println(employees);
    }
    public static void main(String[] args) {
        Returntype rt = new Returntype();
        rt.getEmployees();
        // System.out.println(rt.getEmployees());
    }
}


class Employees{
    String name;
    int salary;
    Employees(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + this.name + "'" +
            ", salary='" + this.salary + "'" +
            "}";
    }
    
}
