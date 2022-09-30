import java.util.Scanner;

public class IndexOfElement {
  static int indexOfElement(int[] arr, int elem) {
    for (int i=0; i<arr.length; i++) {
      if (arr[i] == elem) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int[] arr = {9,2,3,8,6,4,7,1,0,5};

    System.out.print("Enter the Element to search in the array: ");
    int elem = reader.nextInt();
    int val = indexOfElement(arr, elem);
    if (val == -1)
      System.out.println(elem + " is not in the array");
    else
      System.out.println(elem + " is at index " + val);
  }
}