public class ReversingArray {
  public static void main(String[] args) {
    int[] arr = {0,1,2,3,4,5,6,7,8,9};
    int length = arr.length-1;
    int temp;

    System.out.println("Before Reversing: ");
    for (int i: arr)
      System.out.print(i + " ");

    for (int i=0; i<length/2; i++) {
      temp = arr[i];
      arr[i] = arr[length-i];
      arr[length-i] = temp;
    }
    System.out.println("\nAfter Reversing: ");
    for (int i: arr)
      System.out.print(i + " ");
  }
}
