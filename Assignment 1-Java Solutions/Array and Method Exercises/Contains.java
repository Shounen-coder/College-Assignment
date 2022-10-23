public class Contains {
  public static boolean contains(int[] array, int key) {
    for (int i=0; i<array.length; i++) {
      if (array[i] == key)
        return true;
    }
    return false;
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int key = 5;
    if (contains(arr, key))
      System.out.println("Array contains the key " + key);
    else
      System.out.println("Array does not contain the key " + key);
  }
}
