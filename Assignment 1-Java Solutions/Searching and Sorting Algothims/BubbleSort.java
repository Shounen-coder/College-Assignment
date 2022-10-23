import java.util.Arrays;

public class BubbleSort {
  public static void bubbleSort(int[] array) {
    int length = array.length, temp;
    boolean swapped = false;
    do {
      swapped = false; 
      for (int i=1; i<length; i++) {
        if (array[i-1] > array[i]) {
          temp = array[i-1];
          array[i-1] = array[i];
          array[i] = temp;                  
          swapped = true; 
        }
      }
      length--; 
    } while (swapped); 
  }
  public static void main(String[] args) {
    int[] arr = {2,4,6,9,8,0,5,8,1,3,8,6};
    System.out.println("Array: " + Arrays.toString(arr));
    bubbleSort(arr);
    System.out.println("Array after sorting using Bubble Sort: " = Arrays.toString(arr));
  }
}