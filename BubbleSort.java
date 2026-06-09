public class BubbleSort {
  static void bubble(int[] a) {
    int n = a.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j+1] = temp;
        }
      }
???
    }
  }

  public static void main(String[] args) {
    int[] a = { 5, 9, 7, 6, 2 };
    bubble(a);
    for (int i : a) {
      System.out.print(i + " ");
    }
  }
}
