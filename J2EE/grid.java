import java.awt.GridLayout;
import javax.swing.*;
public class grid
{
public static void main(String args[])
{
JFrame f=new JFrame();
JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.setLayout(new GridLayout(2,3,20,30));
f.setSize(500,500);
f.setVisible(true);
}
}