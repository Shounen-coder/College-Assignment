import java.util.Arrays;

public class Reverse {
  public static void reverse(int[] array) {
    int temp, length = array.length;
    for (int i=0; i<length/2; i++) {
      temp = array[i];
      array[i] = array[length-i-1];
      array[length-i-1] = temp;
    }
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    System.out.println("Before reversing: " + Arrays.toString(arr));
    reverse(arr);
    System.out.println("After reversing: " + Arrays.toString(arr));
  }
}
