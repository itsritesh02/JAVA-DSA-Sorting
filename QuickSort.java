public class QuickSort {

  static void displayArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void swap(int [] arr, int x, int y){
    int temp = arr[x];
    arr[x]=arr[y];
    arr[y]=temp;
  }
  static int partition(int [] arr,int st, int end){
    int pivot = arr[st];
    int count = 0;
    for(int i=st+1;i<=end; i ++)
    {
      if(arr[i]<=pivot) count++;
    }
    int pivotIdx = st + count;
    swap(arr,st,pivotIdx);
    int i=st,j=end;
   

    //All lesser elements in left,greater in right
    while(i<pivotIdx && j>pivotIdx){
while(arr[i]<=pivot) i++;
while(arr[j]>pivot) j--;
if(i<pivotIdx && j>pivotIdx){
  swap(arr,i,j);
  i++;
  j--;
}
    }
return pivotIdx;
  }

  static void quick(int [] arr, int st , int end){
    if(st>=end) return;
    int pi = partition(arr,st,end);
    quick(arr,st,pi-1);
    quick(arr,pi+1,end);
  }


  public static void main(String[] args) {
    int [] arr ={6, 3, 1, 5, 4};
    System.out.println("Array before Sorting");
    displayArray(arr);
    System.out.println();

quick(arr, 0,arr.length-1);

    System.out.println("Array After Sorting");
    displayArray(arr);
    
  }
}
