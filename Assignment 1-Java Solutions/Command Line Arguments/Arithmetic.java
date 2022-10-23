public class Arithmetic {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.err.println("Usage: java Arithmetic int1 int2 op");
      return;
    }

    int operand1 = Integer.parseInt(args[0]);
    int operand2 = Integer.parseInt(args[1]);
    char theOperator = args[2].charAt(0);

    System.out.print(args[0] + " " + args[2] + " " + args[1] + " = ");
    switch (theOperator) {
      case '+':
        System.out.println(operand1 + operand2);
        break;
      case '-':
        System.out.println(operand1 - operand2);
        break;
      case '*':
        System.out.println(operand1 * operand2);
        break;
      case '/':
        System.out.println(operand1 / operand2);
        break;
      default:
        System.err.println("Error: invalid operator!");
    }
  }
}
