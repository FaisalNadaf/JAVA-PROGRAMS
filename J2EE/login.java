import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class login {
public static void main(String args[])
{
JFrame j=new JFrame("Login Page");
JLabel l1=new JLabel("Enter Username");
 JLabel l2=new JLabel("Enter Password");
final JTextField t=new JTextField();
final JPasswordField p=new JPasswordField();
JButton b=new JButton("Sign up");
l1.setBounds(10, 50, 100, 30);
l2.setBounds(10, 100, 100, 30);
t.setBounds(120, 50, 120, 30);
p.setBounds(120, 100, 120, 30);
b.setBounds(100, 150, 80, 30);

j.add(l1);
j.add(l2);
j.add(t);
j.add(p);
j.add(b);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e) {
if(t.getText().equals("admin")&&p.getText().equals("admin"))
{
JOptionPane.showMessageDialog(null,
"Login successfull");
}
else
{
JOptionPane.showMessageDialog(null,
"Invalid credentials");
}
}
});
j.setSize(500,500);
j.setLayout(null);
j.setVisible(true);
}
}