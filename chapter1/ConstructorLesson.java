package chapter1;

public class ConstructorLesson {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        c1.numEggs = 4;     //writting object values
        c1.name = "Tita"; //writting object values
        System.out.println(c1.name); //reading object values
    }
}

class Chicken{
    int numEggs;
    String name;
    Chicken(){
        name = "Mama";
    }
}
class Name{
    String first;
    String last;
    String full;
    Name(){
        first ="Marc";
        last ="Yim";
        full=first+last;
    }
    Name(String first, String last){
        this.first = first;
        this.last = last;
        full=first+last;
    }
    {System.out.println("summer");}
    public static void main(String[] args) {
        Name n1 = new Name();
        System.out.println(n1.first);
        System.out.println(n1.last);
        System.out.println(n1.full);
        n1.first = "John";
        n1.last = "Dela Cruz";
        System.out.println(n1.first);
        System.out.println(n1.last);
        System.out.println(n1.full);
        { System.out.println("winter");}
        Name n2 = new Name("Jane", "Doe");
        System.out.println(n2.first);
        System.out.println(n2.last);
        System.out.println(n2.full);
    }
    { System.out.println("snow");}
}