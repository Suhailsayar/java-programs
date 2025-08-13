class base{
    int a = 10;
    int b = 20;

    void display() {
        System.out.println("Base class display method");
    }
}

class derived extends base {
    int c = 30;

    void display() {
        System.out.println("Derived class display method");
    }

    void show() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        derived obj = new derived();
        obj.display(); // Calls the overridden method in derived class
        obj.show();    // Calls the method to show values
    }
}
// Output:
// Derived class display method
// Value of a: 10
// Value of b: 20
// Value of c: 30 