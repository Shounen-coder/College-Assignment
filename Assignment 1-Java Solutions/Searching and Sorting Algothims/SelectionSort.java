import java.util.Arrays;

public class SelectionSort {
  public static void selectionSort(int[] arr) {
    int index, temp, length = arr.length;
    for (int i=0; i<length-1; i++) {  
      index = i;
      for (int j=i+1; j<length; j++){  
        if (arr[j] < arr[index])
          index = j;
      }
      temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }  
  }
  public static void main(String[] args) {
    int[] arr = {89, 0, 17, 1, 3, 2, 2, 43, 10, 38, 21};  

    System.out.println("Array: " + Arrays.toString(arr));
    selectionSort(arr);
    System.out.println("Array after sorting using selection sort: " + Arrays.toString(arr));
  }
}
