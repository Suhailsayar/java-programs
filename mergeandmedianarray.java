// program to merge two sorted arrays and find the median of the merged array without using scanner
class MergeAndMedianArray {
  public static void main(String[] args) {
    int[] arr1 = {1, 3, 5, 7, 9};
    int[] arr2 = {2, 4, 6, 8, 10};
    int[] mergedArray = mergeArrays(arr1, arr2);        
    double median = findMedian(mergedArray);
    System.out.println("Merged Array: ");
    for (int num : mergedArray) {
      System.out.print(num + " ");
    }
    System.out.println("\nMedian of the merged array: " + median);
  } 

  // Method to merge two sorted arrays
  public static int[] mergeArrays(int[] arr1, int[] arr2) {
    int n1 = arr1.length;
    int n2 = arr2.length;
    int[] mergedArray = new int[n1 + n2];
    int i = 0, j = 0, k = 0;
    while (i < n1 && j < n2) {
      if (arr1[i] < arr2[j]) {
        mergedArray[k++] = arr1[i++];
      } else {
        mergedArray[k++] = arr2[j++];
      }
    }
    while (i < n1) {
      mergedArray[k++] = arr1[i++];
    }
    while (j < n2) {
      mergedArray[k++] = arr2[j++];
    }
    return mergedArray;
  }

  // Method to find the median of a sorted array
  public static double findMedian(int[] arr) {
    int n = arr.length;
    if (n % 2 == 0) {
      return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
    } else {
      return arr[n / 2];
    }   
  }
}
