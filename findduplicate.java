//program to find duplicate element in a string array
class findduplicate {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "apple", "kiwi", "banana"};
        boolean foundDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate element found: " + arr[i]); 
                    foundDuplicate = true;
                    break;
                }
            }
            if (foundDuplicate) { 
                break; 
            }
        }
        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }
    }
}
