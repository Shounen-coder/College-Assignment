public class ReversingARow {
  public static void main(String[] args) {
    int[][] arr = {
      {1,2,3,4,5},
      {6,7,8,9,10},
      {11,12,13,14,15}
    };

    int temp;
    int rowLength = arr[0].length-1;

    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<rowLength/2; j++) {
        temp = arr[i][j];
        arr[i][j] = arr[i][rowLength-j];
        arr[i][rowLength-j] = temp;
      }
    }

    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<rowLength+1; j++)
        System.out.print(arr[i][j] + " ");
      System.out.println();
    }
  }
}
