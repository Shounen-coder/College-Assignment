import java.util.Arrays;

public class InsertionSort {
  public static void insertionSort(int[] arr) {
    int length = arr.length, key, i;  
    for (int j = 1; j<length; j++) {  
      key = arr[j];
      i = j-1;
      while ((i >= 0) && (arr[i] > key)) {
        arr[i+1] = arr[i];
        i--;
      }
      arr[i+1] = key;
    }
  }
  public static void main(String[] args) {
    int[] arr = {89, 0, 17, 1, 3, 2, 2, 43, 10, 38, 21};  

    System.out.println("Array: " + Arrays.toString(arr));
    insertionSort(arr);
    System.out.println("Array after sorting using insertion sort: " + Arrays.toString(arr));
  }
}
