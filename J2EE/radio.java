import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class radio
{
public static void main(String args[])
{
JFrame f=new JFrame("Example of radio button");
final JRadioButton r1=new JRadioButton("Advanced Java");
final JRadioButton r2=new JRadioButton("Python");
JButton b=new JButton("Click");
ButtonGroup bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);
f.setSize(500,500);
r1.setBounds(100, 150,120,40);
r2.setBounds(100, 200,120,40);
b.setBounds(200,300,80,40);
f.add(r1);
f.add(r2);
f.add(b);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e) {
if(r1.isSelected())
{
JOptionPane.showMessageDialog(null,
"Advanced Java Selected");
}
if(r2.isSelected())
{
JOptionPane.showMessageDialog(null,
"Python Selected");
}
}
});
f.setLayout(null);
f.setVisible(true);
}
}