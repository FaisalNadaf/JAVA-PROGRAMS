import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
class key extends JFrame implements KeyListener
{
JLabel l;
JTextArea area;
key()
{
l=new JLabel(" Example of key listener");
l.setBounds(120,40,220,30);
area=new JTextArea();
area.setBounds(140,80,200,200);
add(l);
add(area);
area.addKeyListener(this);
setSize(500,500);
setLayout(null);
setVisible(true);
}
public void keyTyped(KeyEvent e)
{
l.setText("Key Typed");
}
public void keyPressed(KeyEvent e)
{
l.setText("Key Pressed");
}
public void keyReleased(KeyEvent e)
{
l.setText("Key Released");
}
public static void main(String args[])
{
new key();
}
}
