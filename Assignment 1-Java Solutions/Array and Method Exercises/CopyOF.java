import java.util.Arrays;

public class CopyOF {
  public static int[] copyOf(int[] array) {
    int arr[] = new int[array.length];
    for (int i=0; i<array.length; i++)
      arr[i] = array[i];
    return arr;
  }
  public static int[] copyOf(int[] array, int newLength) {
    int arr[] = new int[newLength];
    for (int i=0; i<newLength; i++)
      arr[i] = array[i];
    return arr;
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    System.out.println("Given array: " + Arrays.toString(arr));
    System.out.println("New copied array: " + Arrays.toString(copyOf(arr)));
    System.out.println("New copied string copied upto a given length: " + Arrays.toString(copyOf(arr)));
  }
}
