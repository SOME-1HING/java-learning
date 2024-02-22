import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ButtonFrame extends Frame implements ActionListener {

  Button b;

  Random rand;

  Color c;

  public ButtonFrame() {
    addWindowListener(new MyWindowAdapter3());

    b = new Button("Change Color");

    b.addActionListener(this);

    add(b);

    rand = new Random();
  }

  public void paint(Graphics g) {}

  public static void main(String args[]) {
    ButtonFrame ob = new ButtonFrame();

    ob.setSize(new Dimension(300, 200));

    ob.setTitle("An AWT-Based Application--Buttons in frame");

    ob.setLayout(new FlowLayout());

    ob.setVisible(true);
  }

  public void actionPerformed(ActionEvent ie) {
    //repaint();

    float r = rand.nextFloat();

    float gr = rand.nextFloat();

    float b = rand.nextFloat();

    c = new Color(r, gr, b);

    setBackground(c);
  }
}

class MyWindowAdapter3 extends WindowAdapter {

  public void windowClosing(WindowEvent we) {
    System.exit(0);
  }
}
