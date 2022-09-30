import java.util.Scanner;

public class NumToWords {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = reader.nextInt();

    String[] arr = new String[20];
    int i=0;

    while (num!=0) {
      switch (num%10) {
        case 0:
          arr[i] = "Zero";
          break;
        case 1:
          arr[i] = "One";
          break;
        case 2:
          arr[i] = "Two";
          break;
        case 3:
          arr[i] = "Three";
          break;
        case 4:
          arr[i] = "Four";
          break;
        case 5:
          arr[i] = "Five";
          break;
        case 6:
          arr[i] = "Six";
          break;
        case 7:
          arr[i] = "Seven";
          break;
        case 8:
          arr[i] = "Eight";
          break;
        case 9:
          arr[i] = "Nine";
          break;
      }
      num = num/10;
      i++;
    }
    for (i=arr.length-1; i>=0; i--) {
      if (arr[i] != null)
        System.out.print(arr[i] + " ");
    }
  }
}
