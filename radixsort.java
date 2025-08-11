//program to implement radix sort on an array
class RadixSort {
  public static void main(String[] args) {
    int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
    radixSort(arr);
    System.out.println("Sorted array: ");
    for (int num : arr) {   
      System.out.print(num + " ");
    }
  } 

  // Method to perform radix sort
  public static void radixSort(int[] arr) {
    int max = getMax(arr);
    for (int exp = 1; max / exp > 0; exp *=
      10) {
      countingSort(arr, exp);
    }
  }   

  // Method to get the maximum element in the array
  public static int getMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  } 
  // Method to perform counting sort based on the digit represented by exp
  public static void countingSort(int[] arr, int exp) {
    int n = arr.length;
    int[] output = new int[n];
    int[] count = new int[10];    
    for (int i = 0; i < n; i++) {
      count[(arr[i] / exp) % 10]++;
    }
    for (int i = 1; i < 10; i++) {
      count[i] += count[i - 1];
    }
    for (int i = n - 1; i >= 0; i--) {
      output[count[(arr[i] / exp) % 10] - 1] =
        arr[i];
      count[(arr[i] / exp) % 10]--;
    }
    for (int i = 0; i < n; i++) {
      arr[i] = output[i];
    }
  }
}


