import java.util.Scanner;

public class SearchAnElement {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int[] arr = {9,0,2,5,3,7,8,6,1,4,2,4,0,4,6,4,3,8,2,3,4,5,9,2,7,7,4,3,5,4,3,5,4,8,5,3,8,9};

    System.out.print("Enter the number to search: ");
    int num = reader.nextInt();

    int index = 0;
    int[] occurences = new int[arr.length];
    for (int i=0; i<arr.length; i++) {
      if (arr[i] == num) {
        occurences[index] = i;
        index++;
      }
    }
    if ((occurences[0] == occurences[1]) && (occurences[1] == 0))
      System.out.println(num + "doesn't exist in the array");
    else {
      System.out.println("First Occurence is at index: " + occurences[0]);
      int count = 1;
      for (int i=1; i<occurences.length && occurences[i]!=0; i++)
        count++;
      System.out.println("Total number of occurences: " + count);
    }
  }
}