import java.awt.*;
import java.awt.event.*;

public class MouseMove extends Frame implements MouseListener {

  Label L;

  MouseMove() {
    addMouseListener(this);

    addWindowListener(new MyWindowAdapter());

    L = new Label("My First Frame");

    L.setBounds(100, 150, 120, 40);

    add(L);

    setSize(300, 300);

    setLayout(null);

    setBackground(Color.white);

    setVisible(true);
  }

  public void mouseClicked(MouseEvent me) {
    L.setText("Mouse Clicked");
  }

  public void mouseEntered(MouseEvent me) {
    L.setText("Mouse Entered");
  }

  public void mouseExited(MouseEvent me) {
    L.setText("Mouse Exited");
  }

  public void mousePressed(MouseEvent me) {
    L.setText("Mouse Pressed");
  }

  public void mouseReleased(MouseEvent me) {
    L.setText("Mouse Released");
  }

  public static void main(String[] args) {
    new MouseMove();
  }
}

class MyWindowAdapter extends WindowAdapter {

  public void windowClosing(WindowEvent we) {
    System.exit(0);
  }
}
