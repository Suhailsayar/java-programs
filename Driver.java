interface printer{
  void print();
}
interface scanner{
  void scan();
}
class MultiFunctionPrinter implements printer,scanner{
   public void print(){
    System.out.println("print the document");
  }
  public void scan(){
    System.out.println("scan the document");
  }
}
 
public class Driver {
  public static void main(String[] args){
    MultiFunctionPrinter obj = new MultiFunctionPrinter();
    obj.print();
    obj.scan();
  }
}