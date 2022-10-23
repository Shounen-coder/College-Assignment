public class Search {
  public static int search(int[] array, int key) {
    for (int i=0; i<array.length; i++) {
      if (array[i] == key)
        return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int key = 7;
    int index = search(arr, key);

    if (index != -1)
      System.out.println(key + " is found at the index " + index);
    else
      System.out.println(key + " is not available in the array");

  }
}
