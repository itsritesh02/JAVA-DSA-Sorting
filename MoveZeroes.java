public class MoveZeroes {
  static void moveZeroes(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] == 0 && arr[j + 1] != 0) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return;
  }

  public static void main(String[] args) {
    int[] arr = { 0, 5, 4, 0, 8 };
moveZeroes(arr);

for(int val:arr){
  System.out.print(val +" ");
}
  }
}
