 public class Wrapper{
  public static void main(String[] args){
    int a = 10;
    Integer intObj = Integer.valueOf(a);
    //boxing of int to Integer
    System.out.println("Boxing:"+intObj);
    // autoboxing of Integer to int
    int b = intObj;
    System.out.println("Auto boxing:"+b);
    //unboxing of Integer to int
    int c = intObj.intValue();
    System.out.println("Unboxing:"+c);
    //autounboxing of Integer to int
    int d = intObj;
    System.out.println("Auto unboxing:"+d);
  }
}