public class InsertionSort {

  static void insertion(int[] a) {
    int n = a.length;
    for (int i = 1; i < n; i++) {
      int j = i;
      while (j > 0 && a[j - 1] > a[j]) {
        int temp = a[j];
        a[j] = a[j - 1];
        a[j - 1] = temp;
        j--;
      }
    }
  }

  public static void main(String[] args) {
    int[] a = { 5, 9, 7, 6, 2 };
    insertion(a);
    for (int i : a) {
      System.out.print(i + " ");
    }
  }

}
