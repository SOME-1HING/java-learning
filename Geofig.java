import java.util.*;

public class Geofig {

  double area(double r) {
    return (3.14 * r * r);
  }

  float area(float s) {
    return (s * s);
  }

  float area(float l, float b) {
    return (l * b);
  }

  double area(double b, double h) {
    return (0.5 * b * h);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Geofig g = new Geofig();

    System.out.print("Enter the value for radius of circle: ");
    double r = sc.nextDouble();

    System.out.print("Area of circle = " + g.area(r));
    System.out.println("\n");

    System.out.print("Enter the value for side of a square: ");
    float s = sc.nextFloat();

    System.out.print("Area of square = " + g.area(s));
    System.out.println("\n");

    System.out.print("Enter the value for length of rectangle: ");
    float l = sc.nextFloat();

    System.out.print("Enter the value for breadth of rectangle: ");
    float b = sc.nextFloat();

    System.out.print("Area of rectangle = " + g.area(l, b));
    System.out.println("\n");

    System.out.print("Enter the value for base of triangle: ");
    double base = sc.nextDouble();

    System.out.print("Enter the value for height of triangle: ");
    double h = sc.nextDouble();

    System.out.print("Area of triangle = " + g.area(base, h));

    sc.close();
  }
}
