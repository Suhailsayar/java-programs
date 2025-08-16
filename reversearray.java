//program to reverse an integer array
class reversearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 };
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

