import java.io.*;
import java.util.Scanner;

interface Shape {
  public void area(float r);
}

class PiValue {

  static final double pi = 3.142;
}

class Circle extends PiValue implements Shape {

  float radius;
  float areaCircle;

  public void area(float r) {
    radius = r;
    areaCircle = (float) pi * radius * radius;

    System.out.println("Area is " + areaCircle);
  }

  public static void main(String args[]) throws IOException {
    float radius;
    Circle circle = new Circle();
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radius: ");
    radius = sc.nextFloat();

    circle.area(radius);

    sc.close();
  }
}
