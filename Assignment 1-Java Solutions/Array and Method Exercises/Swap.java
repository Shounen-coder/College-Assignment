import java.util.Arrays;

public class Swap {
  public static boolean swap(int[] array1, int[] array2) {
    if (array1.length != array2.length)
      return false;

    int temp;
    for (int i=0; i<array1.length; i++) {
      temp = array1[i];
      array1[i] = array2[i];
      array2[i] = temp;
    }
    return true;
  }
  public static void main(String[] args) {
    int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int arr2[] = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    if (swap(arr1, arr2)) {
      System.out.println("Elements were swapped successfully");
      System.out.println("arr1: " + Arrays.toString(arr1));
      System.out.println("arr2: " + Arrays.toString(arr2));
    }
    else
      System.out.println("Elements were not swapped properly");
  }
}