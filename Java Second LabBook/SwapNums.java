// Java code for swapping 2 numbers

public class SwapNums {
  public static void main(String[] args) {
    float first = 2.50f, second = 4.50f;

    System.out.println("Before swap: ");
    System.out.println("  First number = " + first);
    System.out.println("  Second number = " + second);

    float temporary = first;
    first = second;
    second = temporary;
    System.out.println("After swap:");
    System.out.println("  First number = " + first);
    System.out.println("  Second number = " + second);
  }
}