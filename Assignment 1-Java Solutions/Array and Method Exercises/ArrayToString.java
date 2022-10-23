public class ArrayToString {
  public static String arrayToString(int[] array) {
    String result = "[";
    for (int i=0; i<array.length; i++)
      result += (i==0) ? array[i] : (", " + array[i]);
    result += "]";
    return result;
  }
  public static void main(String[] args) {
    int empty[] = {};
    int oneElement[] = {1};
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    System.out.println("Empty array: " + arrayToString(empty));
    System.out.println("Array with only 1 element: " + arrayToString(oneElement));
    System.out.println("n-element Array: " + arrayToString(arr));
  }
}