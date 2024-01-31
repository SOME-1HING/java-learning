import java.util.Scanner;

public class InsertArray {

  public static void main(String[] args) {
    int n, pos, x;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter no. of elements you want in array: ");
    n = sc.nextInt();

    int arr[] = new int[n + 1];

    System.out.println("Enter all the elements:");

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter the position where you want to insert element: ");
    pos = sc.nextInt();

    System.out.print("Enter the element you want to insert: ");
    x = sc.nextInt();

    for (int i = (n - 1); i >= (pos - 1); i--) {
      arr[i + 1] = arr[i];
    }

    arr[pos - 1] = x;

    System.out.print("After inserting: ");

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + ", ");
    }

    System.out.print(arr[n]);

    sc.close();
  }
}
