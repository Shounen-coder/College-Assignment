public class sample {
  public static void main(String[] args) {
    int i = -243;
    int j = 243;
    if (i==j);
    System.out.println("numbers are the same");
    /*
     * The problem in this code is the if comdition is not
     * performed at all, because the semi-colon after the if 
     * condition statement finishes/halts the if code to execute
     * or extend any further into a code block
     * 
     * Therefore, the if statement has a code block of 0 lines.
     * Thus, the compiler finishes the if statement condition
     * checking, and moves to the next print statement, which
     * gets executed nonetheless the condition mentioned in the
     * if statement
     */
  }
}