import java.awt.BorderLayout;
import javax.swing.*;
public class border
{
public static void main(String args[])
{
JFrame f=new JFrame();
JButton b1=new JButton("North");
JButton b2=new JButton("South");
JButton b3=new JButton("East");
JButton b4=new JButton("West");
JButton b5=new JButton("Center");
f.setLayout(new BorderLayout(20,15));
f.add(b1,BorderLayout.NORTH);
f.add(b2,BorderLayout.SOUTH);
f.add(b3,BorderLayout.EAST);
f.add(b4,BorderLayout.WEST);
f.add(b5,BorderLayout.CENTER);
f.setSize(500,500);
f.setVisible(true);
}
}