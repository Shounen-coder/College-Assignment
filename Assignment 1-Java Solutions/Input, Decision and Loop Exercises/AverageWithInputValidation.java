import java.util.Scanner;

public class AverageWithInputValidation {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    final int NUM_STUDENTS = 3;
    int numberIn, sum = 0;
    boolean isValid;

    for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
      isValid = false;
      do {
        System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
        numberIn = reader.nextInt();
        if ((numberIn>=0) && (numberIn<=100))
          isValid = true;
        else
          System.out.println("Invalid input, try again...");
      } while (!isValid);
      sum += numberIn;
    }

    double average = sum/3.0;
    System.out.printf("The average is: %.2f%n", average);
  }
}
