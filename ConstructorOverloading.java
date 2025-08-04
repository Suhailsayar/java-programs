class Constructor{
  double length,breadth;
  Constructor(double x){
    length=breadth=x;
  }
  Constructor(double x,double y){
    length = x;
    breadth = y;
  }
}
 public class ConstructorOverloading{
  public static void main(String s[]){
    Constructor R1 = new Constructor(10.5);
    Constructor R2 = new Constructor(10.5,9.5);
    System.out.println("area="+ R1.length*R1.breadth);
    System.out.println("area="+ R2.length*R2.breadth);
  }
}