//program to find minimum element in an integer array
class findminimum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4};
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        } 
        System.out.println("Minimum element: " + min);
    }
}
