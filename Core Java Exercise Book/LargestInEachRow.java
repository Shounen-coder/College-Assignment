public class LargestInEachRow {
  public static void main(String[] args) {
    int[][] arr = {
      {2,55,7,4,93},
      {32,53,0,31,54},
      {11,32,45,96,95}
    };

    for (int i=0; i<arr.length; i++) {
      int max = arr[i][0];
      for (int j=1; j<arr[0].length; j++) {
        if (arr[i][j] > max)
          max = arr[i][j];
      }
      System.out.println("Max Element in Row " + (i+1) + " is " + max);
    }
  }
}
