import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class checkbox extends JFrame implements ActionListener
{
JLabel l;
JCheckBox c1,c2,c3;
JButton b;
checkbox()
{
l=new JLabel("Food ordering system");
l.setBounds(150,30,180,30);
c1=new JCheckBox("Pizza @200");
c2=new JCheckBox("Burger @100");
c3=new JCheckBox("Coffee @50");
c1.setBounds(180,60,180,30);
c2.setBounds(180,90,180,30);
c3.setBounds(180,120,180,30);
b=new JButton("Order");
b.setBounds(180,180,180,30);
b.addActionListener(this);
// ButtonGroup bg=new ButtonGroup();
// bg.add(c1);
// bg.add(c2);
// bg.add(c3);
add(l);
add(c1);
add(c2);
add(c3);
add(b);
setSize(500,500);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
float amt=0;
String msg=" ";
if(c1.isSelected())
{
amt+=200;
msg+="Pizza : 200 \n";
}
if(c2.isSelected())
{
amt+=100;
msg+="Burger : 100 \n";
}
if(c3.isSelected())
{
amt+=50;
msg+="Coffee : 50 \n";
}
msg+="____________________ \n";
JOptionPane.showMessageDialog(this, msg+"Total = "+amt);
}
public static void main(String args[])
{
new checkbox();
}
}