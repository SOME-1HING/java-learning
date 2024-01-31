import java.util.Scanner;

public class StringMethod {
  public static void main(String args[]) {
    String first, second;
    Scanner s = new Scanner(System.in);

    System.out.println("String Operations");
    System.out.println();

    System.out.print("Enter the first string: ");
    first = s.nextLine();

    System.out.print("Enter the second string: ");
    second = s.nextLine();

    System.out.println();

    System.out.println("The strings are: " + first + " " + second);
    System.out.println("The length of the first string is: " + first.length());
    System.out.println("The length of the second string is: " + second.length());
    System.out.println("The concatenation of the first and second string is: " + first.concat(" " + second));
    System.out.println("The first character of " + first + " is: " + first.charAt(0));
    System.out.println("The uppercase of " + first + " is: " + first.toUpperCase());
    System.out.println(
        "The substring of the " + first + " starting from index 3 and ending at 6 is: " + first.substring(3, 7));
    System.out.println("Replacing 'a' with 'o' in " + first + " is: " + first.replace('a', 'o'));

    s.close();
  }
}