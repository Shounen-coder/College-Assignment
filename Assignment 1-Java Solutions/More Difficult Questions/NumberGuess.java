import java.util.Scanner;

public class NumberGuess {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    final int SECRET_NUMBER = (int)(Math.random()*100);
    int guess, trials = 0;

    System.out.print("Key in your guess: ");
    while (true) {
      guess = reader.nextInt();
      if (guess > SECRET_NUMBER)
        System.out.print("Try lower: ");
      else if (guess < SECRET_NUMBER)
        System.out.print("Try higher: ");
      else if (guess == SECRET_NUMBER) {
        System.out.println("You got it in " + trials + " trials!");
        break;
      }
      trials++;
    }
  }
}
