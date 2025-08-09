
public class ArrayAddition {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {6, 7, 8, 9, 10};
    int[] result = new int[array1.length];      
    for (int i = 0; i < array1.length; i++) {
      result[i] = array1[i] + array2[i];
    }
    System.out.print("Resultant array: ");
    for (int value : result) {
      System.out.print(value + " ");
    }
    System.out.println();
  }
}