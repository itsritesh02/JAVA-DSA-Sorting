public class SelectionSort {

  static void selection(int[] a) {
    int n = a.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i; j < n; j++) {
        if (a[j] < a[min]) {
          min = j;
        }
      }

      //Swap
      int temp = a[i];
      a[i] = a[min];
      a[min] = temp;
    }
  }

  public static void main(String[] args) {
    int[] a = { 5, 9, 7, 6, 2 };
    selection(a);
    for (int i : a) {
      System.out.print(i + " ");
    }
  }
}
