import java.util.Arrays;

public class RecursiveBinarySearch {
  public static boolean binarySearch(int[] arr, int key, int from, int to) {
    if (from == to-1)
      return key == arr[from];

    int mid = (from + to) / 2;
    if (key == arr[mid])
      return true;
    else if (key < arr[mid])
      to = mid-1;
    else
      from = mid+1;
    return binarySearch(arr, key, from, to);
  }
  public static void main(String[] args) {
    int[] arr =  {0, 1, 2, 2, 3, 10, 17, 21, 38, 43, 89};
    int element = 43; // element to search

    System.out.println("Array: " + Arrays.toString(arr));
    System.out.println("Element to search: " + element);
    if (binarySearch(arr, element, 0, arr.length-1))
      System.out.println(element + " is in the given array");
    else
      System.out.println(element + " is not in the array");
  }
}
