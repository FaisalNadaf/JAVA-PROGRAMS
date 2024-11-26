import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
public class mouse extends JFrame implements MouseListener
{
JLabel l;
mouse()
{
addMouseListener(this);
l=new JLabel();
l.setBounds(20,50,100,20);
add(l);
setSize(500,500);
setLayout(null);
setVisible(true);
}
public void mouseClicked(MouseEvent e) {
l.setText("Mouse clicked");
}
public void mousePressed(MouseEvent e) {
l.setText("Mouse Pressed");
}
public void mouseReleased(MouseEvent e) {
l.setText("Mouse Released");
}
public void mouseEntered(MouseEvent e) {
l.setText("Mouse Entered");
}
public void mouseExited(MouseEvent e) {
l.setText("Mouse Exited");
}
public static void main(String args[])
{
new mouse();
}
}
