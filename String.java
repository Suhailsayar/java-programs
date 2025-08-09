class String{
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "World";
    
    // Concatenating two strings
    String result = str1 + " " + str2;
    
    // Printing the concatenated string
    System.out.println("Concatenated String: " + result);
    
    // Finding the length of the concatenated string
    int length = result.length();
    System.out.println("Length of the concatenated string: " + length);
  }
}