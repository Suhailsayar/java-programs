class Method{
  double length, breadth;
  void get(double x,double y){
    length = x;
    breadth = y;  
  }
  double area(){
    return length * breadth;
  }
  double area(double x){
    length = breadth = x;
    return length * breadth;
  }
  double area(double x, double y){
    length = x;
    breadth = y;
    return length * breadth;
  }
}
public class MethodOverloading {
  public static void main(String[] args) {
    Method rectangle1 = new Method();
    Method rectangle2 = new Method();

    System.out.println("Area of square: " + rectangle1.area(10.5));
    System.out.println("Area of rectangle: " + rectangle2.area(10.5, 9.5));
  }
}