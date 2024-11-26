import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class combo extends JFrame implements ActionListener
{
JLabel l;
JButton b;
JComboBox cb;
combo()
{
l=new JLabel();
l.setBounds(100,30,440,30);
b=new JButton("Show");
b.setBounds(300,100,80,30);
String languages[]= {"C","C++","Java"};
cb=new JComboBox(languages);
cb.setBounds(50, 100, 90,20);
add(l);
add(b);
add(cb);
b.addActionListener(this);
setSize(500,500);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String data="Programming language selected : "+cb.getItemAt(cb.getSelectedIndex());
l.setText(data);
}
public static void main(String args[])
{
new combo();
}
}
