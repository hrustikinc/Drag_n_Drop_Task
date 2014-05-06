import javax.swing.*;
import java.awt.event.*; 

public class movingButton extends JFrame{

private JButton button ;

public movingButton ()
{
super("Position helper");
super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
super.setSize(500,520);
super.setVisible(true);
super.setLayout(null);
button = new JButton ("drag me ");
add(button);
button.setBounds(10, 10, 100, 50); 
button.addMouseMotionListener(new MouseAdapter(){

public void mouseDragged(MouseEvent E)
{
int X=E.getX();
int Y=E.getY();
button.setBounds(X,Y,100,50);
}
});
}

public static void main (String x[])
{ 
new movingButton();
}
}