public class Average {
  static int average(int[] arr) {
    int length = arr.length;
    int sum = 0;
    for (int i: arr)
      sum = sum + i;
    return sum/length;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    int avg = average(arr);
    System.out.println("Average of {1,2,3,4,5,6,7,8,9} is " + avg);
  }
}
