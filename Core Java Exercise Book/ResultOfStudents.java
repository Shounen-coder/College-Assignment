import java.util.Scanner;

public class ResultOfStudents {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter the number of students: ");
    int students = reader.nextInt();

    System.out.print("Enter the number of subjects: ");
    int subjects = reader.nextInt();

    int[][] marks = new int[students][subjects];

    for (int i=0; i<students; i++) {
      System.out.println("For Student " + (i+1) + ": ");
      for (int j=0; j<subjects; j++) {
        System.out.print("  Enter Marks for Subject " + (j+1) + ": ");
        marks[i][j] = reader.nextInt();
      }
    }

    for (int i=0; i<students; i++) {
      System.out.print("Total marks sored by Student " + (i+1) + ": ");
      int sum=0;
      for (int j=0; j<subjects; j++)
        sum += marks[i][j];
      System.out.println(sum);
    }
  }
}
