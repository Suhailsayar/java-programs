//program to show multilevel inheritance in Java
class Base {
    int a = 10;
    int b = 20;   
    void display() {
        System.out.println("Base class display method");
    }
}

class Intermediate extends Base {
    int c = 30;

    void display() {
        System.out.println("Intermediate class display method");
    }

    void show() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
    }
}
class Derived extends Intermediate {
    int d = 40;

    void display() {
        System.out.println("Derived class display method");
    }

    void showAll() {
        show();
        System.out.println("Value of d: " + d);
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display(); // Calls the overridden method in Derived class
        obj.showAll(); // Calls the method to show all values
    }
}