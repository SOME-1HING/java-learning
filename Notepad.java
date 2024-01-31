import java.io.*;

class Notepad {

  public static void main(String[] args) {
    try {
      /* 
       * Deprecated since Java 18
        Runtime rs = Runtime.getRuntime();
        rs.exec("calc");
        rs.exec("notepad");
       */

      // Java 21 code
      ProcessBuilder pb = new ProcessBuilder("calc");
      pb.start();

      pb = new ProcessBuilder("notepad");
      pb.start();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
