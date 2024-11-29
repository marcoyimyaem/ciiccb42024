package chapter5;

public class InheritanceLesson{
    public static void main(String[] args) {
        FinalParent p1 = new FinalParent();
    }
}

final class FinalParent{
    int number;
    void getParent(){
        
    }
}

// class ChildClass extends FinalParent{
//     void getChildParent(){
//         getParent();
//         System.out.println(number);
//     }
// }

class Animal2 extends java.lang.Object {
    String name;
    int age;
    public Animal2(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Lion extends Animal2{
    int LionId;
    public Lion(String name, int age,int LionId){
        super( name, age);
        this.LionId = LionId;
        System.out.println(super.name);
    }


}
class MountainLion extends Lion{
    String locationString;
    public MountainLion(String name, int age,int LionId,String locationString){
        super(name, age, LionId);
        this.locationString = locationString;
        
    }
}

class Canine{
     public double getAverageWeight(){
            return 50;
     }
}

class Wolf extends Canine{
    public double getAverageWeight(){
        return super.getAverageWeight()+20;
 }
    Canine getAnimal(){
        Wolf w1 = null;
        return w1;
    }
 public static void main(String[] args) {
    System.out.println(new Canine().getAverageWeight());
    System.out.println(new Wolf().getAverageWeight());
    Hayop h1 =  new Dog();
 }
}

abstract class Hayop{
    int age;
    String name;
    public void eat(){
        System.out.println("Hayop is eating");
    }
    public abstract String getName();
    abstract int getAge();
    abstract void setAge(int age);
}
abstract class Mammal extends Hayop{
    
    abstract void sayImMammal();
}
class Dog extends Mammal{
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    void sayImMammal() {
        System.out.println("Im a Mammal");
    }
    public void setAge(int age){
        
    }

}
abstract interface CanBurrow{
    public static final int MINIMUM_DEPTH = 2;
    public abstract int getMaximumDepth();
}
interface CanBurrow2 extends CanBurrow{
    int MINIMUM_DEPTH2 = 2;
    int getMaximumDepth2();

}
class FieldMouse extends Hayop implements CanBurrow,CanBurrow2{
    public int getMaximumDepth(){
        return MINIMUM_DEPTH -1;
    }
    public int getMaximumDepth2(){
        return MINIMUM_DEPTH;
    }
    @Override
    public String getName() {
        return name;}
    @Override
    int getAge() {
        return age;
        }
    @Override
    void setAge(int age) {
        }
}