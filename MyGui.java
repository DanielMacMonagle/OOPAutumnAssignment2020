import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MyGui extends JFrame implements ActionListener {


    public static void main(String args[]) {

    

    JFrame addingJButton = new JFrame("Button Question");
    JButton button1 = new JButton("Click me for message");
    button1.setBounds(80,30,300,200);
    addingJButton.add(button1);

    addingJButton.getContentPane().setLayout(new FlowLayout());
    addingJButton.setSize(300,200);


    addingJButton.setVisible(true);
    
    }
}