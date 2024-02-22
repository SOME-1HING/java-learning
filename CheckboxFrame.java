import java.awt.*;
import java.awt.event.*;

public class CheckboxFrame extends Frame implements ItemListener {

  Checkbox red, green, blue, yellow, white;

  CheckboxGroup cbg;

  public CheckboxFrame() {
    addWindowListener(new MyWindowAdapter1());

    cbg = new CheckboxGroup();

    red = new Checkbox("Red", cbg, false);

    green = new Checkbox("Green", cbg, false);

    blue = new Checkbox("Blue", cbg, false);

    yellow = new Checkbox("Yellow", cbg, false);

    white = new Checkbox("White", cbg, true);

    red.addItemListener(this);

    green.addItemListener(this);

    blue.addItemListener(this);

    yellow.addItemListener(this);

    white.addItemListener(this);

    add(red);

    add(green);

    add(blue);

    add(yellow);

    add(white);
  }

  public void paint(Graphics g) {
    String sel = cbg.getSelectedCheckbox().getLabel();

    switch (sel) {
      case "Red":
        setBackground(Color.red);

        break;
      case "Green":
        setBackground(Color.green);

        break;
      case "Blue":
        setBackground(Color.blue);

        break;
      case "Yellow":
        setBackground(Color.yellow);

        break;
      case "White":
        setBackground(Color.white);

        break;
      default:
        setBackground(Color.pink);

        break;
    }
  }

  public static void main(String args[]) {
    CheckboxFrame ob = new CheckboxFrame();

    ob.setSize(new Dimension(300, 200));

    ob.setTitle("An AWT-Based Application--Checkboxes in frame");

    ob.setLayout(new FlowLayout());

    ob.setVisible(true);
  }

  public void itemStateChanged(ItemEvent ie) {
    repaint();
  }
}

class MyWindowAdapter1 extends WindowAdapter {

  public void windowClosing(WindowEvent we) {
    System.exit(0);
  }
}
