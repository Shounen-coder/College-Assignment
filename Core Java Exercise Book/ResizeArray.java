public class ResizeArray {
  public static void main(String[] args) {
    int[] arr = new int[5];
    System.out.println("Before Resizing: Array length = " + arr.length);

    int[] arr2 = arr;
    arr = new int[8];

    System.out.println("After Resizing: Array length = " + arr.length);
  }
}
