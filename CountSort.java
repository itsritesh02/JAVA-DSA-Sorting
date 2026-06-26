public class CountSort {

  static int findMax(int[] arr) {
    // int max= arr[0];
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  static void basicCountSort(int[] arr) {

    int max = findMax(arr); // find the largest element of the array
    int[] count = new int[max + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    int k = 0;
    for (int i = 0; i < count.length; i++) {
      for (int j = 0; j < count[i]; j++) {
        arr[k++] = i;
      }
    }
  }

  static void displayArray(int[] arr) {
    for (int val : arr) {
      System.out.print(val + " ");
    }

  }

  static void countSort(int[] arr) {
    int n = arr.length;
    int[] output = new int[n];
    int max = findMax(arr); // Make frequency
    int[] count = new int[max + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }
    // Make prefix sum array of count array
    for (int i = 1; i < count.length; i++) {
      count[i] += count[i - 1];
    }
    // find index of each element in thr original array and put it in output array
    for (int i = n - 1; i >= 0; i--) {
      int idx = count[arr[i]] - 1;
      output[idx] = arr[i];
      count[arr[i]]--;
    }
    // copy all elements of output to arrray

    for (int i = 0; i < n; i++) {
      arr[i] = output[i];
    }

  }

  public static void main(String[] args) {
    int[] arr = { 1, 4, 5, 2, 2, 5 };
    System.out.println("Basic Count Sort:");
    countSort(arr);
    displayArray(arr);
    System.out.println();
    basicCountSort(arr);
    System.out.println("Stable Count Sort:");
    displayArray(arr);
  }
}
