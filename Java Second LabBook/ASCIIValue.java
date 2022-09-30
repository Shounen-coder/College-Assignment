// Java code for printing ASCII values of characters

public class ASCIIValue {
  public static void main(String[] args) {
    char ch = 'H';
    int ascii = ch;
    int castAscii = (int) ch; 
    System.out.println("The ASCII value of " + ch + " is: " + ascii);
    System.out.println("The ASCII value of " + ch + " is: " + castAscii);
  }
}