class MyException extends Exception {

  private int detail;

  MyException(int a) {
    detail = a;
  }

  public String toString() {
    return "Minor with age less than 18 and you are only " + detail;
  }
}

public class ExceptionDemo {

  static void compute(int x) throws MyException {
    if (x < 18) throw new MyException(x); else System.out.println(
      "You can vote."
    );
  }

  public static void main(String[] args) {
    try {
      compute(20);
      compute(15);
    } catch (MyException e) {
      System.out.println("My Exception caught " + e);
    } finally {
      System.out.println("\nExecution finished.");
    }
  }
}
