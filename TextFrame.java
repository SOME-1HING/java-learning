import java.awt.*;
import java.awt.event.*;

public class TextFrame extends Frame implements ActionListener, KeyListener {

  TextField name;

  int MAX_LEN = 10;

  public TextFrame() {
    Label namep = new Label("Name: ", Label.RIGHT);

    name = new TextField(10);

    add(namep);

    add(name);

    // register to receive action events

    addWindowListener(new MyWindowAdapter());

    name.addActionListener(this);

    name.addKeyListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    repaint();
  }

  public void keyPressed(KeyEvent EVT) {
    String value = name.getText();

    int l = value.length() + 1;

    //showStatus("len ="+l);

    if (l <= MAX_LEN) {
      if (EVT.getKeyChar() >= '0' && EVT.getKeyChar() <= '9') {
        name.setEditable(true);
      } else if (EVT.getKeyChar() >= 'a' && EVT.getKeyChar() <= 'z') {
        name.setEditable(false);
        // showStatus("Enter only numeric digits(0-9)");

      }
    } else {
      //name.setEditable(false);

      //showStatus("length cannot exceed 10....");

      name.setText(name.getText().substring(0, MAX_LEN));
    }
  }

  public void keyReleased(KeyEvent EVT) {}

  public void keyTyped(KeyEvent EVT) {}

  public static void main(String args[]) {
    TextFrame ob = new TextFrame();

    ob.setSize(new Dimension(300, 200));

    ob.setTitle("An AWT-Based Application--TextBox in frame");

    ob.setLayout(new FlowLayout());

    ob.setVisible(true);
  }
}

class MyWindowAdapter extends WindowAdapter {

  public void windowClosing(WindowEvent we) {
    System.exit(0);
  }
}
