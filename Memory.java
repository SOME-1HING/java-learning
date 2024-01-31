public class Memory {

  public static void main(String args[]) throws Exception {
    Runtime rs = Runtime.getRuntime();

    System.out.println("Total Memory is: " + rs.totalMemory());

    System.out.println(
      "Free Memory in JVM before garbage collection = " + rs.freeMemory()
    );

    rs.gc();

    System.out.println(
      "Free Memory in JVM after garbage collection = " + rs.freeMemory()
    );
  }
}
