import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
  public static boolean linearSearch(int[] array, int key) {
    for (int i: array) {
      if (i==key)
        return true;
    }
    return false;
  }

  public static int linearSearchIndex(int[] array, int key) {
    for (int i=0; i<=array.length; i++) {
      if (array[i]==key)
        return i;
    }
    return 0;
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int[] arr = {2, 10, 6, 9, 19, 3, 0, 10, 93, 8};

    System.out.println("Array: " + Arrays.toString(arr));
    System.out.print("Enter the element to search: ");
    int num = reader.nextInt();

    if (linearSearch(arr, num))
      System.out.println("The location of " + num + " in the array is: " + linearSearchIndex(arr, num));
    else
      System.out.println(num + " is not found in the array");
  }
}