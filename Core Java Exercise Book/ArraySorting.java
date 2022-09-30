public class ArraySorting {
  static void IncreasingSort(int[] arr) {
    System.out.print("  Before Sorting:\n  ");
    for(int i: arr)
      System.out.print(i + " ");

    int length = arr.length;
    int temp;
    for(int i=0; i<length; i++) {
      for(int j=1; j<(length-i); j++) {
        if(arr[j-1] > arr[j]) {
          // Swap elements
          temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }       
      }
    }

    System.out.print("\n  After Sorting:\n  ");
    for(int i: arr)
      System.out.print(i + " ");
  }

  static void DecreasingSort(int[] arr) {
    System.out.print("  Before Sorting:\n  ");
    for(int i: arr)
      System.out.print(i + " ");

    int length = arr.length;
    int temp;
    for(int i=0; i<length; i++) {
      for(int j=1; j<(length-i); j++) {
        if(arr[j-1] < arr[j]) {
          // Swap elements
          temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }       
      }
    }

    System.out.print("\n  After Sorting:\n  ");
    for(int i: arr)
      System.out.print(i + " ");
  }
  public static void main(String[] args) {
    int[] arr = {3,6,2,7,0,2,1,9,2,12,54,23,43,11,93};
    System.out.println("Ascendingly Sorted Array: ");
    IncreasingSort(arr);
    System.out.println("\nDescendingly Sorted Array: ");
    DecreasingSort(arr);
  }
}