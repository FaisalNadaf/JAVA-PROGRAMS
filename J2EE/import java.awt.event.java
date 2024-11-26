import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;
public class scrollbar extends JFrame implements AdjustmentListener
{
JLabel l;
JScrollBar sb;
scrollbar()
{
l=new JLabel();
l.setBounds(120,30,200,30);
sb=new JScrollBar(sb.VERTICAL);
sb.setBounds(130,90,150,50);
add(l);
add(sb);
sb.addAdjustmentListener(this);
setSize(500,500);
setLayout(null);
setVisible(true);
}
public void adjustmentValueChanged(AdjustmentEvent e) {
l.setText("Vertical scroll bar value is "+sb.getValue());
}
public static void main(String args[])
{
new scrollbar();
}
}